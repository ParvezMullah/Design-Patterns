package structural.bridge.remotes;

import structural.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote() {

    }

    public AdvancedRemote(Device device) {
        this.device = device;
    }

    public void mute() {
        device.setVolume(0);
    }
}
