package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.SubVersionPart;
import se.gottfridn.library.version.VersionPart;
import se.gottfridn.library.version.format.Separator;
import se.gottfridn.library.version.format.VersionFormatter;

public class VersionPartFactory {
    public static VersionPart getNumericalVersionPart(Number[] numericalSubParts) {
        SubVersionPart[] subParts = new SubVersionPart[numericalSubParts.length];
        int numericalSubPartsIndex = 0;
        for (Number numberSubPart : numericalSubParts) {
            subParts[numericalSubPartsIndex] = SubVersionPartFactory.getNumericalSubVersionPart(numberSubPart);
            numericalSubPartsIndex++;
        }
        return getVersionPart(subParts);
    }

    public static VersionPart getStringVersionPart(String stringSubPart) {
        SubVersionPart subPart = SubVersionPartFactory.getSubVersionPart(stringSubPart);
        SubVersionPart[] subParts = new SubVersionPart[]{subPart};
        return new VersionPartImplementation(subParts);
    }

    public static VersionPart getVersionPart(SubVersionPart[] subParts) {
        return new VersionPartImplementation(subParts);
    }

    private record VersionPartImplementation(SubVersionPart[] subParts)
        implements VersionPart {
        @Override
        public SubVersionPart[] getSubParts() {
            return subParts();
        }

        @Override
        public String toVersionFormat() {
            VersionFormatter<SubVersionPart> formatter = new VersionFormatter<>(subParts(), Separator.SUB_VERSION_PART);
            return formatter.toString();
        }
    }
}
