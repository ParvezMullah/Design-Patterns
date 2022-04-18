package creational.builder.director;

import creational.builder.builders.Builder;
import creational.builder.components.Engine;
import creational.builder.components.GpsNavigator;
import creational.builder.components.MusicPlayer;
import creational.builder.constants.CarType;

public class Director {
    public void constructSUVCar(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine());
        builder.setGpsNavigator(new GpsNavigator());
        builder.setMusicPlayer(new MusicPlayer());
        builder.setSeats(2);
    }
}
