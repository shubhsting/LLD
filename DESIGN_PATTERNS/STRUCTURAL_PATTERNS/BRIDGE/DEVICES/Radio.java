package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE.DEVICES;

public class Radio implements Device {

    boolean isRunning;
    int volume = 0;

    public Radio() {
        isRunning = false;
        volume = 50;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void start() {
        System.out.println("radio started");
        isRunning = true;
    }

    @Override
    public void shutDown() {
        System.out.println("radio closed");
        isRunning = false;
    }

    @Override
    public int getVolumne() {
        return volume;
    }

    @Override
    public void setVolume(int percentage) {
        System.out.println("current radio volume: " + volume);
        int n_volume = volume + (percentage * volume) / 100;
        if (n_volume <= 0)
            volume = 0;
        else if (n_volume >= 100)
            volume = 100;
        volume = n_volume;
        System.out.println("changed radio volume to: " + volume);
    }
}