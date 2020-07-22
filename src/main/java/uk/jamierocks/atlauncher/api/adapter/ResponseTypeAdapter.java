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

import static me.jamiemansfield.gsonsimple.GsonObjects.getObject;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import uk.jamierocks.atlauncher.api.Response;

public class ResponseTypeAdapter<D> extends AbstractResponseTypeAdapter<D> {

    private final ResponseSupplier<D> constructor;

    public ResponseTypeAdapter(final Class<D> type, final ResponseSupplier<D> constructor) {
        super(type);
        this.constructor = constructor;
    }

    @Override
    protected Response<D> createResponse(final boolean error, final int code, final String message, final D data) {
        return this.constructor.create(error, code, message, data);
    }

    @Override
    protected D deserialiseData(final JsonObject json, final JsonDeserializationContext ctx, final Class<D> type, final String key) {
        final JsonObject obj = getObject(json, key);
        return ctx.deserialize(obj, type);
    }

    @Override
    protected JsonElement serialiseData(final Response<D> src, final JsonSerializationContext ctx, final Class<D> type) {
        return ctx.serialize(src.getData().orElse(null), type);
    }

    @FunctionalInterface
    public interface ResponseSupplier<D> {
        Response<D> create(final boolean error, final int code, final String message, final D data);
    }

}
