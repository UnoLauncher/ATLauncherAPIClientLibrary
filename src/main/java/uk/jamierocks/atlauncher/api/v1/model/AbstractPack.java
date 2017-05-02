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

/**
 * The base model for the pack objects.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public abstract class AbstractPack {

    @SerializedName("id") private int id;
    @SerializedName("name") private String name;
    @SerializedName("safeName") private String safeName;
    @SerializedName("type") private Type type;

    protected AbstractPack() {
    }

    /**
     * Gets the identifier of the pack.
     *
     * @return The identifier
     * @since 2.0.0
     */
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSafeName() {
        return this.safeName;
    }

    public Type getType() {
        return this.type;
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

}
