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

public class PspAction {

    private int stage;
    private String url;
    private String md5;
    private String directory;
    private boolean extract;

    public Stage getStage() {
        return Stage.get(this.stage);
    }

    public String getUrl() {
        return this.url;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getDirectory() {
        return this.directory;
    }

    public boolean shouldExtract() {
        return this.extract;
    }

    public enum Stage {
        LIBRARIES,
        MODS,
        XML_ACTIONS,
        CONFIGS;

        public static Stage get(int n) {
            for (Stage stage : values()) {
                if (stage.ordinal() == (n - 1)) {
                    return stage;
                }
            }
            return null;
        }
    }
}
