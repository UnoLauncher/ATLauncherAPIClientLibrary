/*
 * This file is part of ATLauncherAPIClientLibrary, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2020, Jamie Mansfield <https://www.jamierocks.uk/>
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

import static me.jamiemansfield.gsonsimple.GsonObjects.getBoolean;
import static me.jamiemansfield.gsonsimple.GsonObjects.getInt;
import static me.jamiemansfield.gsonsimple.GsonObjects.getString;

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

    protected AbstractResponseTypeAdapter(final Class<D> type) {
        this.type = type;
    }

    @Override
    public Response<D> deserialize(final JsonElement json,
                                   final Type typeOfT,
                                   final JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonObject()) throw new JsonParseException("Malformed response, must be an object!");
        final JsonObject response = json.getAsJsonObject();

        final boolean error = getBoolean(response, ERROR);
        final int code = getInt(response, CODE);
        final String message = getString(response, MESSAGE);
        final D data = this.deserialiseData(response, context, this.type, DATA);

        return this.createResponse(error, code, message, data);
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
        response.add(DATA, this.serialiseData(src, context, this.type));
        return response;
    }

    protected abstract Response<D> createResponse(final boolean error, final int code, final String message, final D data);

    protected abstract D deserialiseData(final JsonObject json, final JsonDeserializationContext ctx, final Class<D> type, final String key);

    protected abstract JsonElement serialiseData(final Response<D> src, final JsonSerializationContext ctx, final Class<D> type);

}
