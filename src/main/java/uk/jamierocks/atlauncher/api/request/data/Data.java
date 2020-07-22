/*
 * This file is part of ATLauncherAPIClientLibrary, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2020, Jamie Mansfield <https://www.jamierocks.uk/>
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

package uk.jamierocks.atlauncher.api.request.data;

import com.google.gson.annotations.SerializedName;

/**
 * Represents data being sent to an ATLauncher compatible API.
 *
 * @param <D> The type of the response
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public abstract class Data<D> {

    @SerializedName("data") protected D data;

    protected Data() {
    }

    /**
     * Gets the data to be provided to the API.
     *
     * @return The data
     */
    public D getData() {
        return this.data;
    }

}
