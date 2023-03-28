package se.gottfridn.library.version;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.StringJoiner;

public class VersionFormat {
	public static String formatVersion(Version version) {
		return formatSubVersions(version.getSubVersions());
	}

	public static String formatSubVersions(SubVersion[] subVersions) {
		@SuppressWarnings("all") // Separator.HARD.separator != null
		StringJoiner joiner = new StringJoiner(Separator.HARD.separator);
		for (SubVersion subVersion : subVersions) {
			joiner.add(formatSubVersion(subVersion));
		}
		return joiner.toString();
	}

	public static String formatSubVersion(SubVersion subVersion) {
		return formatParts(subVersion.getParts());
	}

	public static String formatParts(VersionPart[] parts) {
		StringBuilder builder = new StringBuilder();
		for (VersionPart part : parts) {
			builder.append(formatPart(part));
		}
		return builder.toString();
	}

	public static String formatPart(VersionPart part) {
		if (part.separator != null) {
			return part.part + part.separator.separator;
		} else {
			return part.part;
		}
	}
}
