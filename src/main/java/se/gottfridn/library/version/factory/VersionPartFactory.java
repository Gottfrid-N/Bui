package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.VersionSubPart;
import se.gottfridn.library.version.VersionPart;
import se.gottfridn.library.version.format.Separator;
import se.gottfridn.library.version.format.VersionFormatter;

public class VersionPartFactory {
    public static VersionPart getNumericalPart(Number[] numericalSubParts) {
        VersionSubPart[] subParts = new VersionSubPart[numericalSubParts.length];
        int numericalSubPartsIndex = 0;
        for (Number numberSubPart : numericalSubParts) {
            subParts[numericalSubPartsIndex] = VersionSubPartFactory.getNumericalSubPart(numberSubPart);
            numericalSubPartsIndex++;
        }
        return getPart(subParts);
    }

    public static VersionPart getStringPart(String stringSubPart) {
        VersionSubPart subPart = VersionSubPartFactory.getSubPart(stringSubPart);
        return getPart(subPart);
    }

    public static VersionPart getPart(VersionSubPart subPart) {
        return getPart(new VersionSubPart[]{subPart});
    }

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
            VersionFormatter<VersionSubPart> formatter = new VersionFormatter<>(getSubParts(), Separator.VERSION_SUB_PART);
            return formatter.toString();
        }
    }
}
