package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.VersionPart;
import se.gottfridn.library.version.VersionSubPart;
import se.gottfridn.library.version.format.Separator;
import se.gottfridn.library.version.format.VersionFormatter;

/**
 * This class is a factory for creating instances of {@link VersionPart}.
 * <p>
 *     This class provides the static method {@link #getPart(VersionSubPart[])} for creating instances of {@link VersionPart}.
 * </p><p>
 *     This class also provides the static methods
 *     {@link #getPart(VersionSubPart)},
 *     {@link #getStringPart(String)} and
 *     {@link #getNumericalPart(Number[])}.
 * </p>
 * @see #getPart(VersionSubPart[])
 * @see #getPart(VersionSubPart)
 * @see #getStringPart(String)
 * @see #getNumericalPart(Number[])
 * @see VersionSubPart
 */
public class VersionPartFactory {
    /**
     * Constructs a new {@link VersionPart} instance with specified {@link VersionSubPart} array.
     * <p>
     *     The {@link VersionSubPart} is automatically generated from {@code numericalSubParts}.
     * </p>
     *
     * @param numericalSubParts The {@link Number} array to be used for the {@code numericalPart}.
     * @return The {@link VersionPart} instance.
     */
    public static VersionPart getNumericalPart(Number[] numericalSubParts) {
        VersionSubPart[] subParts = new VersionSubPart[numericalSubParts.length];
        int numericalSubPartsIndex = 0;
        for (Number numberSubPart : numericalSubParts) {
            subParts[numericalSubPartsIndex] = VersionSubPartFactory.getSubPart(numberSubPart.toString());
            numericalSubPartsIndex++;
        }
        return getPart(subParts);
    }

    /**
     * Constructs a new {@link VersionPart} instance with specified {@link VersionSubPart} array.
     * <p>
     *     The {@link VersionSubPart} is automatically created with the specified {@link String}
     * </p>
     *
     * @param stringSubPart The {@link String} to be used for the {@link VersionSubPart}.
     * @return The {@link VersionPart} instance.
     */
    public static VersionPart getStringPart(String stringSubPart) {
        VersionSubPart subPart = VersionSubPartFactory.getSubPart(stringSubPart);
        return getPart(subPart);
    }

    /**
     * Constructs a new {@link VersionPart} instance with specified {@link VersionSubPart} array.
     * <p>
     *     The {@link VersionSubPart} array is automatically created with its one element being the {@code subPart}.
     * </p>
     *
     * @param subPart The {@link VersionSubPart} to be used in the {@link VersionSubPart} array.
     * @return The {@link VersionPart} instance.
     */
    public static VersionPart getPart(VersionSubPart subPart) {
        return getPart(new VersionSubPart[]{subPart});
    }

    /**
     * Constructs a new {@link VersionPart} instance with specified {@link VersionSubPart} array.
     *
     * @param subParts The {@link VersionSubPart} array.
     * @return The {@link VersionPart} instance.
     */
    public static VersionPart getPart(VersionSubPart[] subParts) {
        return new VersionPartImplementation(subParts);
    }

    private record VersionPartImplementation(VersionSubPart[] subParts)
        implements VersionPart {
        @Override
        public VersionSubPart[] getSubParts() {
            return subParts();
        }

        @Override
        public String toVersionFormat() {
            return VersionFormatter.format(getSubParts(), Separator.VERSION_SUB_PART);
        }
    }
}
