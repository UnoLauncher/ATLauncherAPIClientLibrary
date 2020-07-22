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

package uk.jamierocks.atlauncher.api.v1.request;

import uk.jamierocks.atlauncher.api.request.DeleteRequest;
import uk.jamierocks.atlauncher.api.request.GetRequest;
import uk.jamierocks.atlauncher.api.request.PutRequest;
import uk.jamierocks.atlauncher.api.request.Request;
import uk.jamierocks.atlauncher.api.v1.model.DownloadStatistics;
import uk.jamierocks.atlauncher.api.v1.model.LeaderboardUser;
import uk.jamierocks.atlauncher.api.v1.model.NewsArticle;
import uk.jamierocks.atlauncher.api.v1.model.Pack;
import uk.jamierocks.atlauncher.api.v1.model.PackVersion;
import uk.jamierocks.atlauncher.api.v1.model.ShareCode;
import uk.jamierocks.atlauncher.api.v1.model.SimplePack;
import uk.jamierocks.atlauncher.api.v1.model.admin.AdminPack;
import uk.jamierocks.atlauncher.api.v1.model.admin.AdminPackFile;
import uk.jamierocks.atlauncher.api.v1.model.admin.AdminPackVersion;
import uk.jamierocks.atlauncher.api.v1.request.response.V1Responses;

import java.util.List;

/**
 * A psuedo-enum of {@link Request}s.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public final class V1Requests {

    public static final GetRequest.Builder<List<LeaderboardUser>> GLOBAL_LEADERBOARD =
            GetRequest.builder("/v1/leaderboards/global/%d/", V1Responses.Get.GlobalLeaderboard.class);

    public static final GetRequest.Builder<List<LeaderboardUser>> PACK_LEADERBOARD =
            GetRequest.builder("/v1/leaderboards/pack/%s/%d/", V1Responses.Get.PackLeaderboard.class);

    public static final GetRequest.Builder<List<LeaderboardUser>> COUNTRY_LEADERBOARD =
            GetRequest.builder("/v1/leaderboards/country/%s/%d/", V1Responses.Get.CountryLeaderboard.class);

    public static final GetRequest.Builder<List<NewsArticle>> NEWS =
            GetRequest.builder("/v1/news/", V1Responses.Get.News.class);

    public static final GetRequest.Builder<Pack> PACK =
            GetRequest.builder("/v1/pack/%s/", V1Responses.Get.Pack.class);

    public static final GetRequest.Builder<PackVersion> PACK_VERSION =
            GetRequest.builder("/v1/pack/%s/%s/", V1Responses.Get.PackVersion.class);

    public static final GetRequest.Builder<List<SimplePack>> SIMPLE_PACKS =
            GetRequest.builder("/v1/packs/simple/", V1Responses.Get.SimplePacks.class);

    public static final GetRequest.Builder<List<Pack>> ALL_PACKS =
            GetRequest.builder("/v1/packs/all/", V1Responses.Get.AllPacks.class);

    public static final GetRequest.Builder<List<Pack>> PUBLIC_PACKS =
            GetRequest.builder("/v1/packs/public/", V1Responses.Get.PublicPacks.class);

    public static final GetRequest.Builder<List<Pack>> SEMI_PUBLIC_PACKS =
            GetRequest.builder("/v1/packs/semipublic/", V1Responses.Get.SemiPublicPacks.class);

    public static final GetRequest.Builder<List<Pack>> PRIVATE_PACKS =
            GetRequest.builder("/v1/packs/private/", V1Responses.Get.PrivatePacks.class);

    public static final GetRequest.Builder<ShareCode> SHARE_CODE =
            GetRequest.builder("/v1/share-codes/%s/", V1Responses.Get.ShareCode.class);

    public static final GetRequest.Builder<DownloadStatistics> DOWNLOAD_STATS =
            GetRequest.builder("/v1/stats/downloads/", V1Responses.Get.DownloadStats.class);

    public static final GetRequest.Builder<Integer> ALL_DOWNLOAD_STATS =
            GetRequest.builder("/v1/stats/downloads/all/", V1Responses.Get.AllDownloadStats.class);

    public static final GetRequest.Builder<Integer> EXE_DOWNLOAD_STATS =
            GetRequest.builder("/v1/stats/downloads/exe/", V1Responses.Get.ExeDownloadStats.class);

    public static final GetRequest.Builder<Integer> ZIP_DOWNLOAD_STATS =
            GetRequest.builder("/v1/stats/downloads/zip/", V1Responses.Get.ZipDownloadStats.class);

    public static final GetRequest.Builder<Integer> JAR_DOWNLOAD_STATS =
            GetRequest.builder("/v1/stats/downloads/jar/", V1Responses.Get.JarDownloadStats.class);

    private V1Requests() {
    }

    /**
     * A psuedo-enum of admin {@link Request}s.
     *
     * @author Jamie Mansfield
     */
    public static class Admin {

        public static final GetRequest.Builder<AdminPack> PACK =
                GetRequest.builder("/v1/admin/pack/%s/", V1Responses.Admin.Get.Pack.class);

        public static final GetRequest.Builder<List<AdminPackFile>> PACK_DIRECTORY =
                GetRequest.builder("/v1/admin/pack/%s/files/%s/", V1Responses.Admin.Get.PackDirectory.class);

        public static final GetRequest.Builder<String> PACK_FILE =
                GetRequest.builder("/v1/admin/pack/%s/files/%s/%s/", V1Responses.Admin.Get.PackFile.class);

        public static final PutRequest.Builder<String, AdminPackFile> ADD_PACK_FILE =
                PutRequest.builder("/v1/admin/pack/%s/file/%s/%s/", V1Responses.Admin.Put.File.class);

        public static final DeleteRequest.Builder<Void> DELETE_PACK_FILE =
                DeleteRequest.builder("/v1/admin/pack/%s/file/%s/%s/");

        public static final GetRequest.Builder<List<String>> PACK_ALLOWED_PLAYERS =
                GetRequest.builder("/v1/admin/pack/%s/settings/allowedplayers/", V1Responses.Admin.Get.PackAllowedPlayers.class);

        public static final PutRequest.Builder<List<String>, List<String>> SET_PACK_ALLOWED_PLAYERS =
                PutRequest.builder("/v1/admin/pack/%s/settings/allowedplayers/", V1Responses.Admin.Put.PackAllowedPlayers.class);

        public static final GetRequest.Builder<List<String>> PACK_TESTERS =
                GetRequest.builder("/v1/admin/pack/%s/settings/testers/", V1Responses.Admin.Get.PackTesters.class);

        public static final GetRequest.Builder<AdminPackVersion> PACK_VERSION =
                GetRequest.builder("/admin/pack/%s/versions/%s/", V1Responses.Admin.Get.PackVersion.class);

        public static final GetRequest.Builder<String> PACK_VERSION_XML =
                GetRequest.builder("/admin/pack/%s/versions/%s/xml/", V1Responses.Admin.Get.PackVersionXml.class);

        public static final GetRequest.Builder<String> PACK_VERSION_JSON =
                GetRequest.builder("/admin/pack/%s/versions/%s/json/", V1Responses.Admin.Get.PackVersionJson.class);

        public static final GetRequest.Builder<List<SimplePack>> PACKS =
                GetRequest.builder("/v1/admin/packs/", V1Responses.Admin.Get.Packs.class);

        private Admin() {
        }

    }

}
