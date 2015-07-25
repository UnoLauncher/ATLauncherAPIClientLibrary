package uk.jamierocks.atlauncher.api;

import static uk.jamierocks.atlauncher.api.ATLauncherAPI.GSON;

import uk.jamierocks.atlauncher.api.objects.ShareCodeObject;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jamie on 25/07/15.
 */
public class ShareCodes {

    public static Response<ShareCodeObject> getShareCode(String sharecode) {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(ATLauncherAPI.makeRequest(String.format("/share-codes/%s/", sharecode),
                    "GET"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(reader, ShareCodesResponse.class);
    }

    private class ShareCodesResponse extends Response<ShareCodeObject> {

    }
}
