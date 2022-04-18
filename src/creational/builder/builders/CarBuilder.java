package creational.builder.builders;

import creational.builder.cars.Car;
import creational.builder.components.Engine;
import creational.builder.components.GpsNavigator;
import creational.builder.components.MusicPlayer;
import creational.builder.constants.CarType;

public class CarBuilder implements Builder {
    private int seats;
    private Engine engine;
    private GpsNavigator gpsNavigator;
    private MusicPlayer musicPlayer;
    private CarType carType;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setGpsNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car getResult() {
        return new Car(seats, engine, gpsNavigator, musicPlayer, carType);
    }
}
