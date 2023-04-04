package se.gottfridn.library.version;

import se.gottfridn.library.version.format.VersionFormat;

/**
 * This interface represents a {@code part} of a {@link SubVersion} using a {@link VersionSubPart} array.
 * <p>
 *     This interface defines {@link VersionPart#getSubParts()} for accessing the {@link VersionSubPart} array.
 * </p><p>
 *     This extends {@link VersionFormat},
 *     so {@link Version#toVersionFormat()} can be used to get a {@link String} representation of the {@code VersionPart}.
 * </p>
 */
public interface VersionPart
    extends VersionFormat {
    /**
     * Gets the {@link VersionSubPart} array.
     *
     * @return The {@link VersionSubPart} array.
     */
    VersionSubPart[] getSubParts();

    /**
     * Converts the {@link VersionSubPart} array to a formatted {@link String}.
     *
     * @return The formatted {@link String}
     */
    @Override
    String toVersionFormat();
}
