package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE.DEVICES;

public class TV implements Device {

    boolean isRunning;
    int volume = 0;

    public TV() {
        isRunning = false;
        volume = 10;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void start() {
        isRunning = true;
    }

    @Override
    public void shutDown() {
        isRunning = false;
    }

    @Override
    public int getVolumne() {
        return volume;
    }

    @Override
    public void setVolume(int percentage) {
        int n_volume = volume + (percentage * volume) / 100;
        if (n_volume <= 0)
            volume = 0;
        else if (n_volume >= 100)
            volume = 100;
        volume = n_volume;
    }
}
