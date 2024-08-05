package Builder.domain;

public interface PatternPlate {
    String getPlate();
    String getCountry();
}

class USA implements PatternPlate{
    @Override
    public String getPlate() {
        return "Blue with White";
    }

    @Override
    public String getCountry() {
        return "United States.";
    }

}

class Brazil implements PatternPlate{
    @Override
    public String getPlate() {
        return "Pattern Mercosul";
    }

    @Override
    public String getCountry() {
        return "Brazil.";
    }
}
