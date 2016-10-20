/*
 * This file is part of ATLauncher-API--Java, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2016, Jamie Mansfield <https://www.jamierocks.uk/>
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

package uk.jamierocks.atlauncher.api.response;

import java.util.Optional;

/**
 * Represents a response from the ATLauncher API.
 *
 * @param <D> The type of the response
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class Response<D> {

    private boolean error;
    private int code;
    private String message;
    private D data;

    protected Response() {}

    /**
     * Returns weather the API experienced an error.
     *
     * @return {@code True} if an error occurred, {@code false} otherwise
     * @since 2.0.0
     */
    public boolean isError() {
        return this.error;
    }

    /**
     * Returns the <a href="https://wiki.atlauncher.com/api:response_code"></a> for this call.
     *
     * @return The API Response Code
     * @since 2.0.0
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Returns the message of the response, if present.
     *
     * @return The response message
     * @since 2.0.0
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Returns the data of the response, if present.
     *
     * @return The response data
     * @since 2.0.0
     */
    public Optional<D> getData() {
        return Optional.ofNullable(this.data);
    }

}
