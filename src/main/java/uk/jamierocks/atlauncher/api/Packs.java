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
package uk.jamierocks.atlauncher.api;

import static uk.jamierocks.atlauncher.api.ATLauncherAPI.GSON;

import uk.jamierocks.atlauncher.api.model.PackModel;
import uk.jamierocks.atlauncher.api.model.SimplePackModel;
import uk.jamierocks.atlauncher.api.response.Response;

import java.io.IOException;
import java.io.InputStreamReader;

public class Packs {

    public static Response<SimplePackModel[]> getSimple() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/packs/full/simple/", "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, SimplePacksResponse.class);
    }

    public static Response<PackModel[]> getAll() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/packs/full/all/", "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PacksResponse.class);
    }

    public static Response<PackModel[]> getPublic() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/packs/full/public/", "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PacksResponse.class);
    }

    public static Response<PackModel[]> getSemiPublic() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/packs/full/semipublic/", "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PacksResponse.class);
    }

    public static Response<PackModel[]> getPrivate() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest("/packs/full/private/", "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, PacksResponse.class);
    }

    private class PacksResponse extends Response<PackModel[]> {

    }

    private class SimplePacksResponse extends Response<SimplePackModel[]> {

    }
}
