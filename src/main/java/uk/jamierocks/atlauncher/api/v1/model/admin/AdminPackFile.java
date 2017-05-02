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

/**
 * Represents the <a href="https://wiki.atlauncher.com/api:admin_pack_file_object">admin pack file object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class AdminPackFile {

    @SerializedName("filename") private String fileName;
    @SerializedName("size") private int size;
    @SerializedName("md5") private String md5;
    @SerializedName("path") private String path;
    @SerializedName("file") private boolean file;
    @SerializedName("__LINK") private String link;

    protected AdminPackFile() {
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getSize() {
        return this.size;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPath() {
        return this.path;
    }

    public boolean isFile() {
        return this.file;
    }

    public String getLink() {
        return this.link;
    }

}
