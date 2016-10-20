/*
 * This file is part of ATLauncher-API--Java, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2016, Jamie Mansfield <https://www.jamierocks.uk/>
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
import java.util.List;

/**
 * Represents the <a href="https://wiki.atlauncher.com/api:pack_object">pack object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class Pack {

    private int id;
    private String name;
    private String safeName;
    private Type type;
    private List<Version> versions;
    private String description;
    private String supportURL;
    private String websiteURL;

    protected Pack() {}

    /**
     * Gets the identifier of the pack.
     *
     * @return The identifier
     * @since 2.0.0
     */
    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSafeName() {
        return this.safeName;
    }

    public final Type getType() {
        return this.type;
    }

    public final List<Version> getVersions() {
        return this.versions;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSupportURL() {
        return this.supportURL;
    }

    public final String getWebsiteURL() {
        return this.websiteURL;
    }

    /**
     * Represents the type of a pack.
     *
     * @author Jamie Mansfield
     * @since 2.0.0
     */
    public enum Type {
        @SerializedName("public") PUBLIC,
        @SerializedName("semipublic") SEMI_PUBLIC,
        @SerializedName("private") PRIVATE
    }

    /**
     * Represents the <a href="https://wiki.atlauncher.com/api:pack_version_array">pack version array</a>.
     *
     * @author Jamie Mansfield
     * @since 2.0.0
     */
    public static class Version {

        private String version;
        private String minecraft;
        private int published;
        @SerializedName("__LINK") private String link;

        protected Version() {}

        public final String getVersion() {
            return this.version;
        }

        public final String getMinecraft() {
            return this.minecraft;
        }

        public final Date getPublished() {
            return new Date(this.published);
        }

        public final String getLink() {
            return this.link;
        }
    }
}
