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

/**
 * Represents a <pre>DELETE</pre> request to an ATLauncher-compatible API.
 *
 * @param <D> The data, that is given to the API
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class DeleteRequest<D> extends PlainRequest<D> {

    /**
     * Creates a new builder, that can go onto construct a {@link DeleteRequest}.
     *
     * @param route The API path
     * @param <D> The type of the data, given to the API
     * @return A builder
     */
    public static <D> Builder<D> builder(final String route) {
        return new Builder<>(route);
    }

    protected DeleteRequest(final String route, final Data<D> data) {
        super(route, data);
    }

    /**
     * Represents a builder that can be used to construct {@link DeleteRequest}s.
     *
     * @author Jamie Mansfield
     * @since 2.0.0
     */
    public static class Builder<D> extends PlainRequest.Builder<D> {

        protected Builder(final String route) {
            super(route);
        }

        @Override
        public DeleteRequest<D> build(Data<D> data) {
            return new DeleteRequest<>(this.route, data);
        }

    }

}
