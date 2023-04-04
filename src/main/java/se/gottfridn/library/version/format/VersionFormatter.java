package se.gottfridn.library.version.format;

import java.util.StringJoiner;

public record VersionFormatter<T extends VersionFormat>(T[] version, Separator separator) {
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(separator.toString());
        for (T subVersion : version) {
            joiner.add(subVersion.toVersionFormat());
        }
        return joiner.toString();
    }
}
