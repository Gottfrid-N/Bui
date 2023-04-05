package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.VersionSubPart;

/**
 * This class is a factory for creating instances of {@link VersionSubPart}.
 * <p>
 *     This class provides the static method {@link #getSubPart(String)} for creating instances of {@link VersionSubPart}.
 * </p>
 * @see #getSubPart(String)
 * @see VersionSubPart
 */
public class VersionSubPartFactory {
    /**
     * Constructs a new {@link VersionSubPart} instance.
     *
     * @param subPart The {@link String} in the {@link VersionSubPart}.
     * @return The {@link VersionSubPart} instance.
     */
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
