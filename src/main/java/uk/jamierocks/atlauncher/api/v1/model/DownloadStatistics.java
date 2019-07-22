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

/**
 * Represents a <a href="https://wiki.atlauncher.com/api:download_stats_object">download stat object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class DownloadStatistics {

    private final int exe;
    private final int jar;
    private final int zip;

    public DownloadStatistics(final int exe, final int jar, final int zip) {
        this.exe = exe;
        this.jar = jar;
        this.zip = zip;
    }

    /**
     * Gets the total number of downloads the launcher has has, for all platforms.
     *
     * @return The number of launcher downloads, for all platforms
     * @since 2.0.0
     */
    public int getAll() {
        return this.exe + this.jar + this.zip;
    }

    /**
     * Gets the number of downloads the launcher has, on Windows.
     *
     * @return The number of launcher downloads, for Windows
     * @since 2.0.0
     */
    public int getExe() {
        return this.exe;
    }

    /**
     * Gets the number of downloads the launcher has, for the jar distribution.
     * This will likely be Linux / others.
     *
     * @return The number of launcher downloads, for the jar distribution
     * @since 2.0.0
     */
    public int getJar() {
        return this.jar;
    }

    /**
     * Gets the number of downloads the launcher has, on MacOS.
     *
     * @return The number of launcher downloads, for MacOS
     * @since 2.0.0
     */
    public int getZip() {
        return this.zip;
    }

}
