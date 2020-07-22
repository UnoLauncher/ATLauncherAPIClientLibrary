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

package uk.jamierocks.atlauncher.api.v1.model;

import java.time.Instant;

/**
 * Represents the <a href="https://wiki.atlauncher.com/api:news_object">news object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class NewsArticle {

    private final String title;
    private final int comments;
    private final String link;
    private final Instant publishedAt;
    private final String content;

    public NewsArticle(final String title,
                       final int comments,
                       final String link,
                       final Instant publishedAt,
                       final String content) {
        this.title = title;
        this.comments = comments;
        this.link = link;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    /**
     * Gets the title of the news article.
     *
     * @return The title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Gets the amount of comments for the article.
     *
     * @return The amount of comments
     */
    public int getComments() {
        return this.comments;
    }

    /**
     * Gets the link of the news article.
     *
     * @return The link
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Gets the date the article was published
     *
     * @return The date published
     */
    public Instant getPublishedAt() {
        return this.publishedAt;
    }

    /**
     * Gets the content of the news article.
     *
     * @return The content
     */
    public String getContent() {
        return this.content;
    }

}
