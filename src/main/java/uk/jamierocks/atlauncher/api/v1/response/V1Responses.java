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

package uk.jamierocks.atlauncher.api.v1.response;

import uk.jamierocks.atlauncher.api.Route;
import uk.jamierocks.atlauncher.api.response.Response;
import uk.jamierocks.atlauncher.api.v1.model.LeaderboardUser;

import java.util.List;

/**
 * A list of all the available responses.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public final class V1Responses {

    private V1Responses() {}

    @Route("/v1/leaderboards/global/%d/")
    public static final class GlobalLeaderboards extends Response<List<LeaderboardUser>> {
    }

    @Route("/v1//leaderboards/pack/%s/%d/")
    public static final class PackLeaderboards extends Response<List<LeaderboardUser>> {
    }

    @Route("/v1//leaderboards/country/%s/%d/")
    public static final class CountryLeaderboards extends Response<List<LeaderboardUser>> {
    }

    @Route("/v1//news/")
    public static final class News extends Response<List<uk.jamierocks.atlauncher.api.v1.model.News>> {
    }

    @Route("/v1//pack/%s/")
    public static final class Pack extends Response<uk.jamierocks.atlauncher.api.v1.model.Pack> {
    }

}
