package creational.builder.cars;

import creational.builder.components.Engine;
import creational.builder.components.GpsNavigator;
import creational.builder.components.MusicPlayer;
import creational.builder.constants.CarType;

public class Car {

    private final int seats;
    private final Engine engine;
    private final GpsNavigator gpsNavigator;
    private final MusicPlayer musicPlayer;
    private final CarType carType;
    private double fuel = 0;

    public Car(int seats, Engine engine, GpsNavigator gpsNavigator, MusicPlayer musicPlayer, CarType carType) {
        this.seats = seats;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
        this.musicPlayer = musicPlayer;
        this.carType = carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public GpsNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", gpsNavigator=" + gpsNavigator +
                ", musicPlayer=" + musicPlayer +
                ", carType=" + carType +
                ", fuel=" + fuel +
                '}';
    }
}
