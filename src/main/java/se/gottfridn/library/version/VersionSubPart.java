package se.gottfridn.library.version;

import se.gottfridn.library.version.format.VersionFormat;

/**
 * This interface represents a {@code SubPart} of a {@link VersionPart} using a {@link String}.
 * <p>
 *     This interface exist because otherwise {@link se.gottfridn.library.version.format.VersionFormatter} wouldn't work due to not being able to format strings.
 * </p><p>
 *     This extends {@link VersionFormat},
 *     so {@link Version#toVersionFormat()} can be used to get a {@link String} representation of the {@code VersionPart}.
 * </p>
 */
public interface VersionSubPart
    extends VersionFormat {
    /**
     * Converts the {@link String} to a formatted {@link String}.
     *
     * @return The formatted {@link String}
     */
    @Override
    String toVersionFormat();
}
