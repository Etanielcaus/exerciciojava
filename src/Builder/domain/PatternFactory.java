package Builder.domain;

public class PatternFactory {

    public static PatternPlate patternPlateFactory(Country country){
        switch (country){
            case BRAZIL -> {
                return new Brazil();
            }
            case USA -> {
                return new USA();
            }
            default -> {
                throw new IllegalArgumentException("No country added.");
            }
        }

    }
}
