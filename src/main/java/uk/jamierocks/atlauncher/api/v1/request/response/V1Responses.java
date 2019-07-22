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

package uk.jamierocks.atlauncher.api.v1.request.response;

import uk.jamierocks.atlauncher.api.Response;
import uk.jamierocks.atlauncher.api.v1.model.DownloadStatistics;
import uk.jamierocks.atlauncher.api.v1.model.LeaderboardUser;
import uk.jamierocks.atlauncher.api.v1.model.NewsArticle;
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

        public static final class GlobalLeaderboard extends Response<List<LeaderboardUser>> {

            public GlobalLeaderboard(final boolean error, final int code, final String message, final List<LeaderboardUser> data) {
                super(error, code, message, data);
            }

        }

        public static final class PackLeaderboard extends Response<List<LeaderboardUser>> {

            public PackLeaderboard(final boolean error, final int code, final String message, final List<LeaderboardUser> data) {
                super(error, code, message, data);
            }

        }

        public static final class CountryLeaderboard extends Response<List<LeaderboardUser>> {

            public CountryLeaderboard(final boolean error, final int code, final String message, final List<LeaderboardUser> data) {
                super(error, code, message, data);
            }

        }

        public static final class News extends Response<List<NewsArticle>> {

            public News(final boolean error, final int code, final String message, final List<NewsArticle> data) {
                super(error, code, message, data);
            }

        }

        public static final class Pack extends Response<uk.jamierocks.atlauncher.api.v1.model.Pack> {

            public Pack(final boolean error, final int code, final String message, final uk.jamierocks.atlauncher.api.v1.model.Pack data) {
                super(error, code, message, data);
            }

        }

        public static final class PackVersion extends Response<uk.jamierocks.atlauncher.api.v1.model.PackVersion> {

            public PackVersion(final boolean error, final int code, final String message, final uk.jamierocks.atlauncher.api.v1.model.PackVersion data) {
                super(error, code, message, data);
            }

        }

        public static final class SimplePacks extends Response<List<SimplePack>> {

            public SimplePacks(final boolean error, final int code, final String message, final List<SimplePack> data) {
                super(error, code, message, data);
            }

        }

        public static final class AllPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {

            public AllPacks(final boolean error, final int code, final String message, final List<uk.jamierocks.atlauncher.api.v1.model.Pack> data) {
                super(error, code, message, data);
            }

        }

        public static final class PublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {

            public PublicPacks(final boolean error, final int code, final String message, final List<uk.jamierocks.atlauncher.api.v1.model.Pack> data) {
                super(error, code, message, data);
            }

        }

        public static final class SemiPublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {

            public SemiPublicPacks(final boolean error, final int code, final String message, final List<uk.jamierocks.atlauncher.api.v1.model.Pack> data) {
                super(error, code, message, data);
            }

        }

        public static final class PrivatePacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {

            public PrivatePacks(final boolean error, final int code, final String message, final List<uk.jamierocks.atlauncher.api.v1.model.Pack> data) {
                super(error, code, message, data);
            }

        }

        public static final class ShareCode extends Response<uk.jamierocks.atlauncher.api.v1.model.ShareCode> {

            public ShareCode(final boolean error, final int code, final String message, final uk.jamierocks.atlauncher.api.v1.model.ShareCode data) {
                super(error, code, message, data);
            }

        }

        public static final class DownloadStats extends Response<DownloadStatistics> {

            public DownloadStats(final boolean error, final int code, final String message, final DownloadStatistics data) {
                super(error, code, message, data);
            }

        }

        public static final class AllDownloadStats extends Response<Integer> {

            public AllDownloadStats(final boolean error, final int code, final String message, final Integer data) {
                super(error, code, message, data);
            }

        }

        public static final class ExeDownloadStats extends Response<Integer> {

            public ExeDownloadStats(final boolean error, final int code, final String message, final Integer data) {
                super(error, code, message, data);
            }

        }

        public static final class ZipDownloadStats extends Response<Integer> {

            public ZipDownloadStats(final boolean error, final int code, final String message, final Integer data) {
                super(error, code, message, data);
            }

        }

        public static final class JarDownloadStats extends Response<Integer> {

            public JarDownloadStats(final boolean error, final int code, final String message, final Integer data) {
                super(error, code, message, data);
            }

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

            public static final class Pack extends Response<AdminPack> {

                public Pack(final boolean error, final int code, final String message, final AdminPack data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackDirectory extends Response<List<AdminPackFile>> {

                public PackDirectory(final boolean error, final int code, final String message, final List<AdminPackFile> data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackFile extends Response<String> {

                public PackFile(final boolean error, final int code, final String message, final String data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackAllowedPlayers extends Response<List<String>> {

                public PackAllowedPlayers(final boolean error, final int code, final String message, final List<String> data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackTesters extends Response<List<String>> {

                public PackTesters(final boolean error, final int code, final String message, final List<String> data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackVersion extends Response<AdminPackVersion> {

                public PackVersion(final boolean error, final int code, final String message, final AdminPackVersion data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackVersionXml extends Response<String> {

                public PackVersionXml(final boolean error, final int code, final String message, final String data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackVersionJson extends Response<String> {

                public PackVersionJson(final boolean error, final int code, final String message, final String data) {
                    super(error, code, message, data);
                }

            }

            public static final class Packs extends Response<List<SimplePack>> {

                public Packs(final boolean error, final int code, final String message, final List<SimplePack> data) {
                    super(error, code, message, data);
                }

            }

        }

        /**
         * A list of all the PUT responses, as part of the admin v1 API.
         *
         * @author Jamie Mansfield
         * @since 2.0.0
         */
        public static class Put {

            public static final class File extends Response<AdminPackFile> {

                public File(final boolean error, final int code, final String message, final AdminPackFile data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackAllowedPlayers extends Response<List<String>> {

                public PackAllowedPlayers(final boolean error, final int code, final String message, final List<String> data) {
                    super(error, code, message, data);
                }

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

            public static final class Pack extends Response<uk.jamierocks.atlauncher.api.v1.model.Pack> {

                public Pack(final boolean error, final int code, final String message, final uk.jamierocks.atlauncher.api.v1.model.Pack data) {
                    super(error, code, message, data);
                }

            }

            public static final class PackVersion extends Response<PartnerPackVersion> {

                public PackVersion(final boolean error, final int code, final String message, final PartnerPackVersion data) {
                    super(error, code, message, data);
                }

            }

            public static final class AllPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {

                public AllPacks(final boolean error, final int code, final String message, final List<uk.jamierocks.atlauncher.api.v1.model.Pack> data) {
                    super(error, code, message, data);
                }

            }

            public static final class PublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {

                public PublicPacks(final boolean error, final int code, final String message, final List<uk.jamierocks.atlauncher.api.v1.model.Pack> data) {
                    super(error, code, message, data);
                }

            }

            public static final class SemiPublicPacks extends Response<List<uk.jamierocks.atlauncher.api.v1.model.Pack>> {

                public SemiPublicPacks(final boolean error, final int code, final String message, final List<uk.jamierocks.atlauncher.api.v1.model.Pack> data) {
                    super(error, code, message, data);
                }

            }

            public static final class ShareCode extends Response<PartnerShareCode> {

                public ShareCode(final boolean error, final int code, final String message, final PartnerShareCode data) {
                    super(error, code, message, data);
                }

            }

        }

    }

}
