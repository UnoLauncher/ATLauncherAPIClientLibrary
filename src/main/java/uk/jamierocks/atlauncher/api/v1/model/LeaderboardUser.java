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

package uk.jamierocks.atlauncher.api.v1.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Optional;

/**
 * Represents a <a href="https://wiki.atlauncher.com/api:leaderboard_user_object">leaderboard user object</a>.
 *
 * @author Jamie Mansfield
 * @since 2.0.0
 */
public class LeaderboardUser {

    @SerializedName("position") private int position;
    @SerializedName("username") private String username;
    @SerializedName("country") private String country;
    @SerializedName("timePlayed") private int timePlayed;
    @SerializedName("lastPlayed") private int lastPlayed;

    protected LeaderboardUser() {
    }

    /**
     * Returns the position of the player, in said leaderboard.
     *
     * @return The position of the player in the leaderboard
     * @since 2.0.0
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Returns the username of the player.
     *
     * @return The username
     * @since 2.0.0
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns the 2-letter country code the player comes from.
     *
     * @return The 2-letter country code
     * @since 2.0.0
     */
    public Optional<String> getCountry() {
        if (this.country != null && !this.country.isEmpty() && !this.country.equalsIgnoreCase("XX")) {
            return Optional.of(this.country);
        }
        return Optional.empty();
    }

    /**
     * Returns the amount of time the player has played for (in seconds).
     *
     * @return The play time of the player
     * @since 2.0.0
     */
    public int getTimePlayed() {
        return this.timePlayed;
    }

    /**
     * Returns the date the player last played at.
     *
     * @return The last time the player played
     * @since 2.0.0
     */
    public Date getLastPlayed() {
        return new Date(this.lastPlayed);
    }

}
