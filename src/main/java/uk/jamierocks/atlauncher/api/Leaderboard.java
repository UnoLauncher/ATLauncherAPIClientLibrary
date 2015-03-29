/*
 * This file is part of ATLauncher-API---Java, licensed under the MIT License (MIT).
 *
 * Copyright (c) Jamie Mansfield <https://github.com/jamierocks>
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

import static uk.jamierocks.atlauncher.api.ATLauncherAPI.GSON;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Created by jamie on 28/03/15.
 */
public class Leaderboard {

    public static Response<User[]> getGlobal(int limit) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest(String.format("/leaderboards/global/%d/", limit),
                    "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, LeaderboardResponse.class);
    }

    public static Response<User[]> getPack(String packName) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest(String.format("/leaderboards/pack/%s/", packName),
                    "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, LeaderboardResponse.class);
    }

    public static Response<User[]> getPack(String packName, int limit) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(
                    ATLauncherAPI.makeRequest(String.format("/leaderboards/pack/%s/%d/", packName,
                            limit), "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, LeaderboardResponse.class);
    }

    public static Response<User[]> getCountry(String country) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(
                    ATLauncherAPI.makeRequest(String.format("/leaderboards/country/%s/", country),
                            "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, LeaderboardResponse.class);
    }

    public static Response<User[]> getCountry(String country, int limit) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest(String.format("/leaderboards/country/%s/%d/",
                    country, limit), "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, LeaderboardResponse.class);
    }

    public class User {

        private int position;
        private String username;
        private String country;
        private int timePlayed;
        private int lastPlayed;

        /**
         * The position of this user
         *
         * @return the position of the user, in the leaderboard
         */
        public int getPosition() {
            return position;
        }

        public String getUsername() {
            return username;
        }

        public String getCountry() {
            return country;
        }

        public int getTimePlayed() {
            return timePlayed;
        }

        public Date getLastPlayed() {
            return new Date(lastPlayed);
        }
    }

    private class LeaderboardResponse extends Response<User[]> {

    }
}
