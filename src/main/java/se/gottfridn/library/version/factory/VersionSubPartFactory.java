package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.VersionSubPart;

public class VersionSubPartFactory {
    public static VersionSubPart getNumericalSubPart(Number subPart) {
        return getSubPart(String.valueOf(subPart));
    }

    public static VersionSubPart getSubPart(String subPart) {
        return new VersionSubPartImplementation(subPart);
    }

    private record VersionSubPartImplementation(String subPart)
        implements VersionSubPart {
        @Override
        public String toVersionFormat() {
            return subPart();
        }
    }
}
