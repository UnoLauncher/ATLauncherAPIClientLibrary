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

package uk.jamierocks.atlauncher.api;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * A client that communicates with an ATLauncher-compatible API.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class Client {

    public static Builder builder() {
        return new Builder();
    }

    private final String apiBaseUrl;
    private final String apiKey;
    private final OkHttpClient client = new OkHttpClient();

    private Client(final Builder builder) {
        this.apiBaseUrl = builder.apiBaseUrl;
        this.apiKey = builder.apiKey;
    }

    public Call call(final String route) {
        final Request.Builder builder = new Request.Builder()
                .url(this.apiBaseUrl + route);
        if (this.apiKey != null && !this.apiKey.isEmpty()) {
            builder.addHeader("API-KEY", this.apiKey);
        }
        return this.client.newCall(builder.build());
    }

    /**
     * A builder for constructing a {@link Client}.
     *
     * @author Jamie Mansfield
     */
    public static class Builder {

        private String apiBaseUrl = "https://api.atlauncher.com";
        private String apiKey = null;

        private Builder() {
        }

        /**
         * Sets the API base URL of the ATLauncher API.
         *
         * @param apiBaseUrl The base URL of the API
         * @return The builder
         */
        public Builder apiBaseUrl(final String apiBaseUrl) {
            this.apiBaseUrl = apiBaseUrl;
            return this;
        }

        /**
         * Sets the API key, used to authenticate with the ATLauncher API.
         *
         * @param apiKey The authentication key of the API
         * @return The builder
         */
        public Builder apiKey(final String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Constructs a new {@link Client}.
         *
         * @return An ATLauncher client, for the server of the given properties
         */
        public Client build() {
            return new Client(this);
        }

    }

}
