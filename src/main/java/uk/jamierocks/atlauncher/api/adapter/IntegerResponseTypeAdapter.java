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

import static me.jamiemansfield.gsonsimple.GsonObjects.getInt;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import uk.jamierocks.atlauncher.api.IntegerResponse;
import uk.jamierocks.atlauncher.api.Response;

public class IntegerResponseTypeAdapter extends AbstractResponseTypeAdapter<Integer> {

    public IntegerResponseTypeAdapter() {
        super(Integer.class);
    }

    @Override
    protected Response<Integer> createResponse(final boolean error, final int code, final String message, final Integer data) {
        return new IntegerResponse(error, code, message, data);
    }

    @Override
    protected Integer deserialiseData(final JsonObject json, final JsonDeserializationContext ctx, final Class<Integer> type, final String key) {
        return getInt(json, key);
    }

    @Override
    protected JsonElement serialiseData(final Response<Integer> src, final JsonSerializationContext ctx, final Class<Integer> type) {
        return src.getData().isPresent() ?
                new JsonPrimitive(src.getData().get()) :
                JsonNull.INSTANCE;
    }

}
