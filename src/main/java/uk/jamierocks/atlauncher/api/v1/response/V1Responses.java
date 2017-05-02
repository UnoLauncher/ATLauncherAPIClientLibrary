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
import uk.jamierocks.atlauncher.api.v1.model.DownloadStatistics;
import uk.jamierocks.atlauncher.api.v1.model.LeaderboardUser;
import uk.jamierocks.atlauncher.api.v1.model.SimplePack;
import uk.jamierocks.atlauncher.api.v1.model.admin.AdminPack;
import uk.jamierocks.atlauncher.api.v1.model.admin.AdminPackFile;
import uk.jamierocks.atlauncher.api.v1.model.admin.AdminPackVersion;
import uk.jamierocks.atlauncher.api.v1.model.partner.PartnerPackVersion;
import uk.jamierocks.atlauncher.api.v1.model.partner.PartnerShareCode;

import java.util.List;

/**
 * A list of all the available responses, as part of the v1 API.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public final class V1Responses {

    private V1Responses() {
    }

    /**
     * A list of all the GET responses, as part of the public v1 API.
     *
     * @author Jamie Mansfield
     * @since 2.0.0
     */
    public static class Get {

        private Get() {
        }

        @Route("/v1/leaderboards/global/%d/")
        public static final class GlobalLeaderboard extends Response<List<LeaderboardUser>> {
        }

        @Route("/v1/leaderboards/pack/%s/%d/")
        public static final class PackLeaderboard extends Response<List<LeaderboardUser>> {
        }

        @Route("/v1/leaderboards/country/%s/%d/")
        public static final class CountryLeaderboard extends Response<List<LeaderboardUser>> {
        }

        @Route("/v1/news/")
        public static final class News extends Response<List<uk.jamierocks.atlauncher.api.v1.model.News>> {
        }

        @Route("/v1/pack/%s/")
        public static final class Pack extends Response<uk.jamierocks.atlauncher.api.v1.model.Pack> {
        }

        @Route("/v1/pack/%s/%s/")
        public static final class PackVersion extends Response<uk.jamierocks.atlauncher.api.v1.model.PackVersion> {
        }

        @Route("/v1/packs/simple/")
        public static final class SimplePacks extends Response<List<SimplePack>> {
        }

        @Route("/v1/packs/all/")
        public static final class AllPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {
        }

        @Route("/v1/packs/public/")
        public static final class PublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {
        }

        @Route("/v1/packs/semipublic/")
        public static final class SemiPublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {
        }

        @Route("/v1/packs/private/")
        public static final class PrivatePacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {
        }

        @Route("/v1/share-codes/%s/")
        public static final class ShareCode extends Response<uk.jamierocks.atlauncher.api.v1.model.ShareCode> {
        }

        @Route("/v1/stats/downloads/")
        public static final class DownloadStats extends Response<DownloadStatistics> {
        }

        @Route("/v1/stats/downloads/all/")
        public static final class AllDownloadStats extends Response<Integer> {
        }

        @Route("/v1/stats/downloads/exe/")
        public static final class ExeDownloadStats extends Response<Integer> {
        }

        @Route("/v1/stats/downloads/zip/")
        public static final class ZipDownloadStats extends Response<Integer> {
        }

        @Route("/v1/stats/downloads/jar/")
        public static final class JarDownloadStats extends Response<Integer> {
        }

    }

    /**
     * A list of all the available admin responses, as part of the v1 API.
     *
     * @author Jamie Mansfield
     * @since 2.0.0
     */
    public static class Admin {

        private Admin() {
        }

        /**
         * A list of all the GET responses, as part of the admin v1 API.
         *
         * @author Jamie Mansfield
         * @since 2.0.0
         */
        public static class Get {

            private Get() {
            }

            @Route("/v1/admin/pack/%s/")
            public static final class Pack extends Response<AdminPack> {
            }

            @Route("/v1/admin/pack/%s/files/%s/")
            public static final class PackDirectory extends Response<List<AdminPackFile>> {
            }

            @Route("/v1/admin/pack/%s/files/%s/%s/")
            public static final class PackFile extends Response<String> {
            }

            @Route("/v1/admin/pack/%s/settings/allowedplayers/")
            public static final class PackAllowedPlayers extends Response<List<String>> {
            }

            @Route("/v1/admin/pack/%s/settings/testers/")
            public static final class PackTesters extends Response<List<String>> {
            }

            @Route("/admin/pack/%s/versions/%s/")
            public static final class PackVersion extends Response<AdminPackVersion> {
            }

            @Route("/admin/pack/%s/versions/%s/xml/")
            public static final class PackVersionXml extends Response<String> {
            }

            @Route("/admin/pack/%s/versions/%s/json/")
            public static final class PackVersionJson extends Response<String> {
            }

            @Route("/v1/admin/packs/")
            public static final class Packs extends Response<List<SimplePack>> {
            }

        }

    }

    /**
     * A list of all the available partner responses, as part of the v1 API.
     *
     * @author Jamie Mansfield
     * @since 2.0.0
     */
    public static class Partner {

        private Partner() {
        }

        /**
         * A list of all the GET responses, as part of the partner v1 API.
         *
         * @author Jamie Mansfield
         * @since 2.0.0
         */
        public static class Get {

            private Get() {
            }

            @Route("/v1/psp/pack/%s/")
            public static final class Pack extends Response<uk.jamierocks.atlauncher.api.v1.model.Pack> {
            }

            @Route("/v1/psp/pack/%s/%s/")
            public static final class PackVersion extends Response<PartnerPackVersion> {
            }

            @Route("/v1/psp/packs/all/")
            public static final class AllPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {
            }

            @Route("/v1/psp/packs/public/")
            public static final class PublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {
            }

            @Route("/v1/psp/packs/semipublic/")
            public static final class SemiPublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {
            }

            @Route("/v1/psp/share-code/%s/")
            public static final class ShareCode extends Response<PartnerShareCode> {
            }

        }

    }

}
