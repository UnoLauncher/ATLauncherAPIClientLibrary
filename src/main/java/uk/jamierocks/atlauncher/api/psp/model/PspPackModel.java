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
package uk.jamierocks.atlauncher.api.psp.model;

import com.google.gson.annotations.SerializedName;
import uk.jamierocks.atlauncher.api.model.PackType;

import java.util.List;

public class PspPackModel {

    private int id;
    private String name;
    private String safeName;
    private PackType type;
    private List<Version> versions;
    private String description;
    private String supportURL;
    private String websiteURL;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSafeName() {
        return this.safeName;
    }

    public PackType getType() {
        return this.type;
    }

    public List<Version> getVersions() {
        return this.versions;
    }

    public String getDescription() {
        return this.description;
    }

    public String getSupportURL() {
        return this.supportURL;
    }

    public String getWebsiteURL() {
        return this.websiteURL;
    }

    public static class Version {

        private String version;
        private String minecraft;
        private int published;
        @SerializedName("__LINK")
        private String link;

        public String getVersion() {
            return this.version;
        }

        public String getMinecraft() {
            return this.minecraft;
        }

        public int getPublished() {
            return this.published;
        }

        public String getLink() {
            return this.link;
        }
    }
}
