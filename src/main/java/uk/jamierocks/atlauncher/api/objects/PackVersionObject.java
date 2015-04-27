package uk.jamierocks.atlauncher.api.objects;

/**
 * Created by jamie on 27/04/15.
 */
public class PackVersionObject {

    private String version;
    private String minecraftVersion;
    private boolean recommended;
    private int published;
    private String serverZipURL;
    private String changelog;

    public String getVersion() {
        return version;
    }

    public String getMinecraftVersion() {
        return minecraftVersion;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public int getPublished() {
        return published;
    }

    public String getServerZipURL() {
        return serverZipURL;
    }

    public String getChangelog() {
        return changelog;
    }
}
