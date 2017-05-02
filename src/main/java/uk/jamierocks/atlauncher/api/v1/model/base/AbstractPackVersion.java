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

package uk.jamierocks.atlauncher.api.v1.model.base;

import com.google.gson.annotations.SerializedName;

/**
 * The base model for pack version models.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public abstract class AbstractPackVersion {

    @SerializedName("version") private String version;
    @SerializedName("minecraftVersion") private String minecraftVersion;
    @SerializedName("recommended") private boolean recommended;
    @SerializedName("published") private int published;
    @SerializedName("changelog") private String changelog;

    protected AbstractPackVersion() {
    }

    public String getVersion() {
        return this.version;
    }

    public String getMinecraftVersion() {
        return this.minecraftVersion;
    }

    public boolean isRecommended() {
        return this.recommended;
    }

    public int getPublished() {
        return this.published;
    }

    public String getChangelog() {
        return this.changelog;
    }

}
