package Builder.domain;

public class Car {
    private String engine;
    private String color;
    private String marca;
    private int year;
    private PatternPlate country;

//    public Car(String engine, String color, String marca, int year) {
//        this.engine = engine;
//        this.color = color;
//        this.marca = marca;
//        this.year = year;
//    }


    public PatternPlate getCountry() {
        return country;
    }

    public void setCountry(PatternPlate country) {
        this.country = country;
    }

    public Car(String engine, String color, String marca, int year, PatternPlate country) {
        this.engine = engine;
        this.color = color;
        this.marca = marca;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", year=" + year +
                ", Country=" + country.getCountry() +
                ", pattern of plate=" + country.getPlate() +
                '}';
    }

    public static class BuilderCar {
        private String engine;
        private String color;
        private String marca;
        private int year;
        private PatternPlate country;

        public BuilderCar setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public BuilderCar setColor(String color) {
            this.color = color;
            return this;
        }

        public BuilderCar setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public BuilderCar setYear(int year) {
            this.year = year;
            return this;
        }

        public BuilderCar setCountry(Country country) {
            this.country = PatternFactory.patternPlateFactory(country);
            return this;
        }

        public Car build() {
            return new Car(engine, color, marca, year, country);
        }

    }
}
