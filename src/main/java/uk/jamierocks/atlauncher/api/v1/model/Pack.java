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

package uk.jamierocks.atlauncher.api.v1.model;

import com.google.gson.annotations.SerializedName;
import uk.jamierocks.atlauncher.api.v1.model.base.AbstractPack;

import java.util.Date;
import java.util.List;

/**
 * Represents the <a href="https://wiki.atlauncher.com/api:pack_object">pack object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class Pack extends AbstractPack {

    @SerializedName("versions") private List<Version> versions;
    @SerializedName("description") private String description;
    @SerializedName("supportURL") private String supportUrl;
    @SerializedName("websiteURL") private String websiteUrl;

    protected Pack() {
    }

    public List<Version> getVersions() {
        return this.versions;
    }

    public String getDescription() {
        return this.description;
    }

    public String getSupportUrl() {
        return this.supportUrl;
    }

    public String getWebsiteUrl() {
        return this.websiteUrl;
    }

    /**
     * Represents the <a href="https://wiki.atlauncher.com/api:pack_version_array">pack version array</a>.
     *
     * @author Jamie Mansfield
     */
    public static class Version {

        @SerializedName("version") private String version;
        @SerializedName("minecraft") private String minecraft;
        @SerializedName("published") private int published;
        @SerializedName("__LINK") private String link;

        protected Version() {}

        public String getVersion() {
            return this.version;
        }

        public String getMinecraft() {
            return this.minecraft;
        }

        public Date getPublished() {
            return new Date(this.published);
        }

        public String getLink() {
            return this.link;
        }

    }

}
