package Builder.domain;

public class Car {
    private String engine;
    private String color;
    private String marca;
    private int year;

    public Car(String engine, String color, String marca, int year) {
        this.engine = engine;
        this.color = color;
        this.marca = marca;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", year=" + year +
                '}';
    }

    public static class BuilderCar{
        private String engine;
        private String color;
        private String marca;
        private int year;

        public BuilderCar setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public BuilderCar setColor(String color){
            this.color = color;
            return this;
        }

        public BuilderCar setMarca(String marca){
            this.marca = marca;
            return this;
        }

        public BuilderCar setYear(int year){
            this.year = year;
            return this;
        }

        public Car build(){
            return new Car(engine, color, marca, year);
        }

    }
}
