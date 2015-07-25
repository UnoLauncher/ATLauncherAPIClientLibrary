package uk.jamierocks.atlauncher.api.objects;

import uk.jamierocks.atlauncher.api.Pack;

/**
 * Created by jamie on 25/07/15.
 */
public class ShareCodeObject {

    private String code;
    private String pack;
    private String version;
    private int used;
    private ShareCodeModObject mods;

    public String getCode() {
        return code;
    }

    public PackObject getPack() {
        return Pack.getPack(pack).getData();
    }

    public String getVersion() {
        return version;
    }

    public int getUsed() {
        return used;
    }

    public ShareCodeModObject getMods() {
        return mods;
    }
}
