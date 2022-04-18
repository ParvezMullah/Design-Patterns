package creational.builder.builders;

import creational.builder.components.Engine;
import creational.builder.components.GpsNavigator;
import creational.builder.components.MusicPlayer;
import creational.builder.constants.CarType;

public interface Builder {
    void setCarType(CarType carType);

    void setEngine(Engine engine);

    void setGpsNavigator(GpsNavigator gpsNavigator);

    void setMusicPlayer(MusicPlayer musicPlayer);

    void setSeats(int seats);
}
