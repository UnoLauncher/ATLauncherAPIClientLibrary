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

package uk.jamierocks.atlauncher.api.v1.model.partner;

import com.google.gson.annotations.SerializedName;
import uk.jamierocks.atlauncher.api.v1.model.Pack;
import uk.jamierocks.atlauncher.api.v1.model.base.Action;

import java.util.List;

/**
 * Represents the <a href="https://wiki.atlauncher.com/api:psp:psp_share_code_object">partner share code object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class PartnerShareCode {

    @SerializedName("pack") private Pack pack;
    @SerializedName("version") private PartnerPackVersion version;
    @SerializedName("actions") private List<Action> actions;

    public Pack getPack() {
        return this.pack;
    }

    public PartnerPackVersion getVersion() {
        return this.version;
    }

    public List<Action> getActions() {
        return this.actions;
    }

}
