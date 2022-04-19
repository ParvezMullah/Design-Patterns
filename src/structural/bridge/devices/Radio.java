package structural.bridge.devices;

public class Radio implements Device {
    private boolean on;
    private int channel = 1;
    private int volume = 1;

    @Override
    public Boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "on=" + on +
                ", channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
