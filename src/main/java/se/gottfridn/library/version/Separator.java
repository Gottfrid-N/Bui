package se.gottfridn.library.version;

import org.jetbrains.annotations.Nullable;

public enum Separator {
	HARD("|"),
	MEDIUM("-"),
	SOFT("."),
	END(null);

	@Nullable
	public final String separator;

	Separator(@Nullable String separator) {
		this.separator = separator;
	}
}
