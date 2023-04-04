package se.gottfridn.library.version;

import se.gottfridn.library.version.format.VersionFormat;

/**
 * This interface represents a {@code part} of a {@link SubVersion} using a {@link SubVersionPart} array.
 * <p>
 *     This interface defines {@link VersionPart#getSubParts()} for accessing the {@link SubVersionPart} array.
 * </p><p>
 *     This extends {@link VersionFormat},
 *     so {@link Version#toVersionFormat()} can be used to get a {@link String} representation of the {@code VersionPart}.
 * </p>
 */
public interface VersionPart
    extends VersionFormat {
    /**
     * Gets the {@link SubVersionPart} array.
     *
     * @return The {@link SubVersionPart} array.
     */
    SubVersionPart[] getSubParts();

    /**
     * Converts the {@link SubVersionPart} array to a formatted {@link String}.
     *
     * @return The formatted {@link String}
     */
    @Override
    String toVersionFormat();
}
