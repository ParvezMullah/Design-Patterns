/*
It lets you construct complex objects step by step.
The pattern allows you to produce different types and representations of an object
using the same construction code.
 */

package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.cars.Car;
import creational.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        director.constructSUVCar(builder);
        Car car = builder.getResult();
        System.out.println(car);

    }
}
