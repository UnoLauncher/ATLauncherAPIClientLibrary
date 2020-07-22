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

package uk.jamierocks.atlauncher.api.request;

import uk.jamierocks.atlauncher.api.request.data.Data;
import uk.jamierocks.atlauncher.api.Response;

/**
 * Represents a request to an ATLauncher-compatible API.
 *
 * @param <D> The type of the data, that is given to the API
 * @param <R> The type of the response, that the request is after
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public abstract class ResponseRequest<D, R> extends Request<D> {

    private final Class<? extends Response<R>> responseClass;

    protected ResponseRequest(final String route, final Data<D> data, final Class<? extends Response<R>> responseClass) {
        super(route, data);
        this.responseClass = responseClass;
    }

    /**
     * Gets the class of the response from the ATLauncher API.
     *
     * @return The response class
     * @since 2.0.0
     */
    public Class<? extends Response<R>> getResponseClass() {
        return this.responseClass;
    }

    /**
     * Represents a builder that can be used to construct {@link ResponseRequest}s.
     *
     * @param <R> The response type of the request
     * @author Jamie Mansfield
     * @since 2.0.0
     */
    public abstract static class Builder<R> extends Request.Builder {

        protected final Class<? extends Response<R>> responseClass;

        protected Builder(final String route, final Class<? extends Response<R>> responseClass) {
            super(route);
            this.responseClass = responseClass;
        }

    }

}
