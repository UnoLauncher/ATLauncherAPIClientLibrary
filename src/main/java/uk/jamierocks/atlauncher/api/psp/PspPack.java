/*
 * This file is part of ATLauncher-API--Java, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2016, Jamie Mansfield <https://github.com/jamierocks>
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
package uk.jamierocks.atlauncher.api.psp;

import static uk.jamierocks.atlauncher.api.ATLauncherAPI.GSON;

import uk.jamierocks.atlauncher.api.ATLauncherAPI;
import uk.jamierocks.atlauncher.api.psp.model.PspPackModel;
import uk.jamierocks.atlauncher.api.psp.model.PspPackVersionModel;
import uk.jamierocks.atlauncher.api.response.Response;

import java.io.IOException;
import java.io.InputStreamReader;

public class PspPack {

    public static Response<PspPackModel> getPack(String apiKey, String name) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(
                    ATLauncherAPI.makeRequest(String.format("/psp/pack/%s/", name), "GET", apiKey));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PackResponse.class);
    }

    public static Response<PspPackVersionModel> getPackVersion(String apiKey, String name, String version) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(
                    ATLauncherAPI.makeRequest(String.format("/pack/%s/%s/", name, version), "GET", apiKey));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PackVersionResponse.class);
    }

    private class PackResponse extends Response<PspPackModel> {

    }

    private class PackVersionResponse extends Response<PspPackVersionModel> {

    }
}
