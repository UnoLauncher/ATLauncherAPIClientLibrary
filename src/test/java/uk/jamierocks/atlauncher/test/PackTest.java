package uk.jamierocks.atlauncher.test;

import uk.jamierocks.atlauncher.api.Pack;
import uk.jamierocks.atlauncher.api.objects.PackVersionObject;

/**
 * Created by jamie on 27/04/15.
 */
public class PackTest {

    public static void main(String[] args) {
        PackVersionObject latest = Pack.getPackVersion("YogscastCompletePack", "2.9.3.4-RR-YOGS").getData();
        System.out.println(String.format("Version: %s, Minecraft: %s", latest.getVersion(), latest.getMinecraftVersion()));
    }
}
