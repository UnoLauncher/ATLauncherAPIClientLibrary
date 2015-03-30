package uk.jamierocks.atlauncher.api.objects;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jamie on 29/03/15.
 */
public class SimplePackObject {

    private int id;
    private String name;
    private String safeName;
    private PackType type;
    @SerializedName("__LINK")
    private String link;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSafeName() {
        return safeName;
    }

    public PackType getType() {
        return type;
    }

    public String getLink() {
        return link;
    }
}
