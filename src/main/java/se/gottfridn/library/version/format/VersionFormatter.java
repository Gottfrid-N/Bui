package se.gottfridn.library.version.format;

import java.util.StringJoiner;

/**
 * This class provides a way of formatting {@link VersionFormat} with separators,
 * This is done using the static method {@link VersionFormatter#format(VersionFormat[], Separator)}.
 * <p>Usage example:
 * <blockquote><pre>
 *  String formattedString = VersionFormatter.format(getSubParts(), Separator.VERSION_SUB_PART)
 * </pre></blockquote></p>
 * @see VersionFormat
 * @see Separator
 */
public class VersionFormatter {
    /**
     * Converts a {@link VersionFormat} to a formatted {@link String} with {@code separators}.
     * <p>
     *     The {@link VersionFormat} is converted using a {@link StringJoiner} with the {@code separator} as the {@code delimiter}
     * </p>
     *
     * @param version The {@link VersionFormat} to be converted.
     * @param separator A {@link Separator} that will be used as the {@code delimiter} for the {@link StringJoiner}.
     * @return The formatted {@link String} representation.
     */
    public static String format(VersionFormat[] version, Separator separator) {
        StringJoiner joiner = new StringJoiner(separator.toString());
        for (VersionFormat subVersion : version) {
            joiner.add(subVersion.toVersionFormat());
        }
        return joiner.toString();
    }
}
