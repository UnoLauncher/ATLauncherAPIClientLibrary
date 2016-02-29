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

import java.util.Date;

public class PspPackVersionModel {

    private String version;
    private String minecraftVersion;
    public int published;
    private String changelog;
    public boolean recommended;
    private String serverJar;
    private String serverMD5;
    private String serverDownloadLink;

    public String getVersion() {
        return this.version;
    }

    public String getMinecraftVersion() {
        return this.minecraftVersion;
    }

    public Date getPublished() {
        return new Date(this.published);
    }

    public String getChangelog() {
        return this.changelog;
    }

    public boolean isRecommended() {
        return this.recommended;
    }

    public String getServerJar() {
        return this.serverJar;
    }

    public String getServerMD5() {
        return this.serverMD5;
    }

    public String getServerDownloadLink() {
        return this.serverDownloadLink;
    }
}
