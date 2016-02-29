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
package uk.jamierocks.atlauncher.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class PackModel {

    private int id;
    private String name;
    private String safeName;
    private PackType type;
    private PackVersion[] versions;
    private String description;
    private String supportURL;
    private String websiteURL;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSafeName() {
        return safeName;
    }

    public PackType getType() {
        return type;
    }

    public PackVersion[] getVersions() {
        return versions;
    }

    public String getDescription() {
        return description;
    }

    public String getSupportURL() {
        return supportURL;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public class PackVersion {

        private String version;
        private String minecraft;
        private int published;
        @SerializedName("__LINK")
        private String link;

        public String getVersion() {
            return version;
        }

        public String getMinecraft() {
            return minecraft;
        }

        public Date getPublished() {
            return new Date(published);
        }

        public String getLink() {
            return link;
        }
    }
}
