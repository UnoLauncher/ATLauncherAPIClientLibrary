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

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.reflect.TypeToken;
import me.jamiemansfield.gsonsimple.GsonObjects;
import uk.jamierocks.atlauncher.api.Response;

import java.util.ArrayList;
import java.util.List;

public class ListResponseTypeAdapter<D> extends AbstractResponseTypeAdapter<List<D>> {

    private final Class<D> type;
    private final ResponseSupplier<List<D>> constructor;

    public ListResponseTypeAdapter(final Class<D> type, final ResponseSupplier<List<D>> constructor) {
        super((Class<List<D>>) new TypeToken<List<D>>() {}.getRawType());
        this.type = type;
        this.constructor = constructor;
    }

    @Override
    protected Response<List<D>> createResponse(final boolean error, final int code, final String message, final List<D> data) {
        return this.constructor.create(error, code, message, data);
    }

    @Override
    protected List<D> deserialiseData(final JsonObject json, final JsonDeserializationContext ctx, final Class<List<D>> type, final String key) {
        final JsonArray arr = GsonObjects.getArray(json, key);
        final List<D> list = new ArrayList<>();
        for (final JsonElement element : arr) {
            list.add(ctx.deserialize(element, this.type));
        }
        return list;
    }

    @Override
    protected JsonElement serialiseData(final Response<List<D>> src, final JsonSerializationContext ctx, final Class<List<D>> type) {
        final JsonArray json = new JsonArray();
        src.getData().ifPresent(list -> list.forEach(entry -> json.add(ctx.serialize(entry, this.type))));
        return json;
    }

    @FunctionalInterface
    public interface ResponseSupplier<D> {
        Response<D> create(final boolean error, final int code, final String message, final D data);
    }

}
