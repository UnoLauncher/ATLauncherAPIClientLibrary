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

package uk.jamierocks.atlauncher.api.v1.adapter;

import static me.jamiemansfield.gsonsimple.GsonObjects.getInt;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import uk.jamierocks.atlauncher.api.adapter.TypeAdapter;
import uk.jamierocks.atlauncher.api.v1.model.DownloadStatistics;

import java.lang.reflect.Type;

public class DownloadStatisticsTypeAdapter implements TypeAdapter<DownloadStatistics> {

    private static final String ALL = "all";
    private static final String EXE = "exe";
    private static final String JAR = "jar";
    private static final String ZIP = "zip";

    @Override
    public DownloadStatistics deserialize(final JsonElement json,
                                          final Type typeOfT,
                                          final JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonObject()) throw new JsonParseException("Malformed download statistics, must be an object!");
        final JsonObject stats = json.getAsJsonObject();

        final int exe = getInt(stats, EXE);
        final int jar = getInt(stats, JAR);
        final int zip = getInt(stats, ZIP);

        return new DownloadStatistics(exe, jar, zip);
    }

    @Override
    public JsonElement serialize(final DownloadStatistics src,
                                 final Type typeOfSrc,
                                 final JsonSerializationContext context) {
        final JsonObject object = new JsonObject();
        object.addProperty(ALL, src.getAll());
        object.addProperty(EXE, src.getExe());
        object.addProperty(JAR, src.getJar());
        object.addProperty(ZIP, src.getZip());
        return object;
    }

}
