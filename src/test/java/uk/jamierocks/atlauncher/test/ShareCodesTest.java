package uk.jamierocks.atlauncher.test;

import uk.jamierocks.atlauncher.api.Response;
import uk.jamierocks.atlauncher.api.ShareCodes;
import uk.jamierocks.atlauncher.api.objects.ShareCodeModObject;
import uk.jamierocks.atlauncher.api.objects.ShareCodeObject;

/**
 * Created by jamie on 25/07/15.
 */
public class ShareCodesTest {

    public static void main(String[] args) {
        Response<ShareCodeObject> response = ShareCodes.getShareCode("vca4EaZq");
        for (ShareCodeModObject.OptionalMod mod : response.getData().getMods().getOptionalMods()) {
            System.out.println(mod.getName());
        }
    }
}
