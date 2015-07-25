package uk.jamierocks.atlauncher.api.objects;

/**
 * Created by jamie on 25/07/15.
 */
public class ShareCodeModObject {

    private OptionalMod[] optional;

    public OptionalMod[] getOptionalMods() {
        return optional;
    }

    public class OptionalMod {

        private boolean selected;
        private String name;

        public boolean isSelected() {
            return selected;
        }

        public String getName() {
            return name;
        }
    }
}
