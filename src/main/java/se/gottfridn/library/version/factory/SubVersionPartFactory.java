package se.gottfridn.library.version.factory;

import se.gottfridn.library.version.SubVersionPart;

public class SubVersionPartFactory {
    public static SubVersionPart getNumericalSubVersionPart(Number subPart) {
        return getSubVersionPart(String.valueOf(subPart));
    }

    public static SubVersionPart getSubVersionPart(String subPart) {
        return new SubVersionPartImplementation(subPart);
    }

    private record SubVersionPartImplementation(String subPart)
        implements SubVersionPart {
        @Override
        public String toVersionFormat() {
            return subPart();
        }
    }
}
