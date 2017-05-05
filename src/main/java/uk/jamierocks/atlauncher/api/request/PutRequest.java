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

package uk.jamierocks.atlauncher.api.request;

import uk.jamierocks.atlauncher.api.request.data.Data;
import uk.jamierocks.atlauncher.api.request.response.Response;

/**
 * Represents a <pre>PRE</pre> request to an ATLauncher-compatible API.
 *
 * @param <D> The data, that is given to the API
 * @param <R> The response to be returned by the API
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class PutRequest<D, R> extends Request<D, R> {

    /**
     * Creates a new builder, that can go onto construct a {@link PutRequest}.
     *
     * @param route The API path
     * @param responseClass The class of the response
     * @param <D> The type of the data given to the API
     * @param <R> The type of the response
     * @return A builder
     */
    public static <D, R> Builder<D, R> builder(final String route, final Class<? extends Response<R>> responseClass) {
        return new Builder<>(route, responseClass);
    }

    protected PutRequest(final String route, final Data<D> data, final Class<? extends Response<R>> responseClass) {
        super(route, data, responseClass);
    }

    public static class Builder<D, R> extends Request.Builder<R> {

        private Builder(final String route, final Class<? extends Response<R>> responseClass) {
            super(route, responseClass);
        }

        /**
         * Constructs a new {@link Builder}, that can be used to construct a new
         * {@link PutRequest}.
         *
         * @param data The data to send to the API
         * @return A request
         */
        public PutRequest<D, R> build(final Data<D> data) {
            return new PutRequest<>(this.route, data, this.responseClass);
        }

    }

}
