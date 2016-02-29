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
import uk.jamierocks.atlauncher.api.model.PackModel;
import uk.jamierocks.atlauncher.api.response.Response;

import java.io.IOException;
import java.io.InputStreamReader;

public class PspPacks {

    public static Response<PackModel[]> getPublic(String apiKey) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/psp/packs/full/public/", "GET", apiKey));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PacksResponse.class);
    }

    public static Response<PackModel[]> getSemiPublic(String apiKey) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/psp/packs/full/semipublic/", "GET", apiKey));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PacksResponse.class);
    }

    public static Response<PackModel[]> getPrivate(String apiKey) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/psp/packs/full/private/", "GET", apiKey));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PacksResponse.class);
    }

    private class PacksResponse extends Response<PackModel[]> {

    }
}
