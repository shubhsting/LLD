package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE.REMOTE;

import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE.DEVICES.Device;

public class BasicRemote implements Remote {
    public Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isRunning())
            device.shutDown();
        else
            device.start();
    }

    @Override
    public void volumeUp() {
        device.setVolume(10);
    }

    @Override
    public void volumeDown() {
        device.setVolume(-10);
    }

}
