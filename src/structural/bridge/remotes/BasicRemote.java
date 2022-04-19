package structural.bridge.remotes;

import structural.bridge.devices.Device;

public class BasicRemote implements Remote {
    public Device device;

    public BasicRemote() {

    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        device.setVolume(Math.max(device.getVolume() + 1, 100));
    }

    @Override
    public void volumeDown() {
        device.setVolume(Math.min(device.getVolume() - 1, 0));
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void ChannelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}
