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

import java.util.List;

/**
 * Represents the <a href="https://wiki.atlauncher.com/api:share_code_object">share code object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class ShareCode {

    @SerializedName("code") private String code;
    @SerializedName("pack") private String pack;
    @SerializedName("version") private String version;
    @SerializedName("used") private int used;
    @SerializedName("mods") private Mods mods;

    protected ShareCode() {
    }

    /**
     * Gets the 8-character share code.
     *
     * @return The share code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the name of the pack, of the share code.
     *
     * @return The pack name
     */
    public String getPack() {
        return this.pack;
    }

    /**
     * Gets the version of the pack, of the share code.
     *
     * @return The pack version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the count of how many times the share code has been used.
     *
     * @return The use count
     */
    public int getUsed() {
        return this.used;
    }

    /**
     * Gets the mods involved with the share code.
     *
     * @return The mods
     */
    public Mods getMods() {
        return this.mods;
    }

    /**
     * Represents the mods object, of the share code object.
     *
     * @author Jamie Mansfield
     */
    public static class Mods {

        @SerializedName("optional") private List<Mod> optional;

        protected Mods() {
        }

        /**
         * Gets a list of optional {@link Mod}s.
         *
         * @return The optional mods
         */
        public List<Mod> getOptional() {
            return this.optional;
        }

    }

    /**
     * Represents the <a href="https://wiki.atlauncher.com/api:share_code_mod_object">mod object</a>, of the share code object.
     *
     * @author Jamie Mansfield
     */
    public static class Mod {

        @SerializedName("name") private String name;
        @SerializedName("selected") private boolean selected;

        protected Mod() {
        }

        /**
         * Gets the name of a mod.
         *
         * @return The mod name
         */
        public String getName() {
            return this.name;
        }

        /**
         * Gets whether the mod is selected.
         *
         * @return {@code True} if the mod is selected,
         *         {@code false} otherwise
         */
        public boolean isSelected() {
            return this.selected;
        }

    }

}
