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

package uk.jamierocks.atlauncher.api.v1.model.admin;

import com.google.gson.annotations.SerializedName;
import uk.jamierocks.atlauncher.api.v1.model.Pack;

import java.util.List;

/**
 * Represents the <a href="https://wiki.atlauncher.com/api:admin_pack_object">admin pack object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class AdminPack extends Pack {

    @SerializedName("devVersions") private List<DevelopmentVersion> devVersions;

    protected AdminPack() {
    }

    public List<DevelopmentVersion> getDevVersions() {
        return this.devVersions;
    }

    /**
     * Represents the <a href="https://wiki.atlauncher.com/api:development_pack_version_array">development pack version object</a>.
     *
     * @author Jamie Mansfield
     */
    public static class DevelopmentVersion {

        @SerializedName("version") private String version;
        @SerializedName("minecraftVersion") private String minecraftVersion;
        @SerializedName("lastEdited") private int lastEdited;
        @SerializedName("__LINK") private String link;

        protected DevelopmentVersion() {
        }

        public String getVersion() {
            return this.version;
        }

        public String getMinecraftVersion() {
            return this.minecraftVersion;
        }

        public int getLastEdited() {
            return this.lastEdited;
        }

        public String getLink() {
            return this.link;
        }

    }

}
