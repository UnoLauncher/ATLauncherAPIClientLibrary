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
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import uk.jamierocks.atlauncher.api.Response;

import java.lang.reflect.Type;

public class ResponseTypeAdapter<D> implements TypeAdapter<Response<D>> {

    private static final String ERROR = "error";
    private static final String CODE = "code";
    private static final String MESSAGE = "message";
    private static final String DATA = "data";

    private final Class<D> type;
    private final ResponseSupplier<D> constructor;

    public ResponseTypeAdapter(final Class<D> type, final ResponseSupplier<D> constructor) {
        this.type = type;
        this.constructor = constructor;
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
        final D data = TypeAdapter.getObject(response, context, this.type, DATA);

        return this.constructor.create(error, code, message, data);
    }

    @Override
    public JsonElement serialize(final Response<D> src,
                                 final Type typeOfSrc,
                                 final JsonSerializationContext context) {
        return null;
    }

    @FunctionalInterface
    public interface ResponseSupplier<D> {

        Response<D> create(final boolean error, final int code, final String message, final D data);

    }

}
