package Builder.test;

import Builder.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car build = new Car.BuilderCar()
                .setColor("Laranja")
                .setEngine("cv4")
                .setYear(1980)
                .setMarca("Volks")
                .build();

        System.out.println(build);
    }
}
