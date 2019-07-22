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
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializer;

public interface TypeAdapter<T> extends JsonSerializer<T>, JsonDeserializer<T> {

    static boolean getBoolean(final JsonObject obj, final String field) throws JsonParseException {
        if (!obj.has(field) || !obj.get(field).isJsonPrimitive()) {
            throw new JsonParseException("Malformed type, missing or malformed " + field + " field!");
        }
        return obj.get(field).getAsBoolean();
    }

    static String getString(final JsonObject obj, final String field) throws JsonParseException {
        if (obj.has(field) && obj.get(field).isJsonNull()) return null;
        if (!obj.has(field) || !obj.get(field).isJsonPrimitive()) {
            throw new JsonParseException("Malformed type, missing or malformed " + field + " field!");
        }
        return obj.get(field).getAsString();
    }

    static int getInt(final JsonObject obj, final String field) throws JsonParseException {
        if (!obj.has(field) || !obj.get(field).isJsonPrimitive()) {
            throw new JsonParseException("Malformed type, missing or malformed " + field + " field!");
        }
        return obj.get(field).getAsInt();
    }

    static long getLong(final JsonObject obj, final String field) throws JsonParseException {
        if (!obj.has(field) || !obj.get(field).isJsonPrimitive()) {
            throw new JsonParseException("Malformed type, missing or malformed " + field + " field!");
        }
        return obj.get(field).getAsLong();
    }

    static <D> D getObject(final JsonObject obj,
                          final JsonDeserializationContext context,
                          final Class<D> type,
                          final String field) throws JsonParseException {
        if (obj.has(field) && obj.get(field).isJsonNull()) return null;
        if (!obj.has(field) || !obj.get(field).isJsonObject()) {
            throw new JsonParseException("Malformed type, missing or malformed " + field + " field!");
        }
        return context.deserialize(obj.get(field), type);
    }

}
