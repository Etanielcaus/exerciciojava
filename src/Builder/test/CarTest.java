package Builder.test;

import Builder.domain.Car;
import Builder.domain.Country;

public class CarTest {
    public static void main(String[] args) {
        Car build = new Car.BuilderCar()
                .setColor("Laranja")
                .setEngine("cv4")
                .setYear(1980)
                .setMarca("Volks")
                .setCountry(Country.BRAZIL)
                .build();

        System.out.println(build);
    }
}
