/*
 * This file is part of ATLauncherAPIClientLibrary, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2017, Jamie Mansfield <https://www.jamierocks.uk/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package uk.jamierocks.atlauncher.api.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import uk.jamierocks.atlauncher.api.Response;

import java.lang.reflect.Type;

public abstract class AbstractResponseTypeAdapter<D> implements TypeAdapter<Response<D>> {

    private static final String ERROR = "error";
    private static final String CODE = "code";
    private static final String MESSAGE = "message";
    private static final String DATA = "data";

    private final Class<D> type;
    private final ResponseSupplier<D> constructor;
    private final DataDeserialiser<D> deserialiser;
    private final DataSerialiser<D> serialiser;

    protected AbstractResponseTypeAdapter(final Class<D> type,
                                          final ResponseSupplier<D> constructor,
                                          final DataDeserialiser<D> deserialiser,
                                          final DataSerialiser<D> serialiser) {
        this.type = type;
        this.constructor = constructor;
        this.deserialiser = deserialiser;
        this.serialiser = serialiser;
    }

    @Override
    public Response<D> deserialize(final JsonElement json,
                                   final Type typeOfT,
                                   final JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonObject()) throw new JsonParseException("Malformed response, must be an object!");
        final JsonObject response = json.getAsJsonObject();

        final boolean error = TypeAdapter.getBoolean(response, ERROR);
        final int code = TypeAdapter.getInt(response, CODE);
        final String message = TypeAdapter.getString(response, MESSAGE);
        final D data = this.deserialiser.deserialise(response, context, this.type, DATA);

        return this.constructor.create(error, code, message, data);
    }

    @Override
    public JsonElement serialize(final Response<D> src,
                                 final Type typeOfSrc,
                                 final JsonSerializationContext context) {
        if (src == null) return JsonNull.INSTANCE;
        final JsonObject response = new JsonObject();
        response.addProperty(ERROR, src.isError());
        response.addProperty(CODE, src.getCode());
        response.addProperty(MESSAGE, src.getMessage().orElse(null));
        response.add(DATA, this.serialiser.serialise(src, context, this.type));
        return response;
    }

    @FunctionalInterface
    public interface ResponseSupplier<D> {
        Response<D> create(final boolean error, final int code, final String message, final D data);
    }

    @FunctionalInterface
    public interface DataDeserialiser<D> {
        D deserialise(final JsonObject json, final JsonDeserializationContext ctx, final Class<D> type, final String key);
    }

    @FunctionalInterface
    public interface DataSerialiser<D> {
        JsonElement serialise(final Response<D> src, final JsonSerializationContext ctx, final Class<D> type);
    }
}
