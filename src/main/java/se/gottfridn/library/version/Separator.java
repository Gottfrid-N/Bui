package se.gottfridn.library.version;

import org.jetbrains.annotations.Nullable;

public enum Separator {
	HARD('|'),
	MEDIUM('-'),
	SOFT('.'),
	END(null);

	@Nullable
	private final Character separator;

	Separator(@Nullable Character separator) {
		this.separator = separator;
	}

	@Override
	public String toString() {
		if (separator == null) {
			return "";
		} else {
			return separator.toString();
		}
	}
}
