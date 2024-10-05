package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE.DEVICES;

public interface Device {
    boolean isRunning();

    void start();

    void shutDown();

    public int getVolumne();

    public void setVolume(int percentage);
}
