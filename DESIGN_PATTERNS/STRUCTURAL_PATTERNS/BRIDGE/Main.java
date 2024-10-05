package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE;


import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE.DEVICES.Radio;
import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.BRIDGE.REMOTE.BasicRemote;

public class Main {
    public static void main(String[] args) {
        BasicRemote remote  = new BasicRemote(new Radio());
        remote.power();
        remote.volumeUp();
        remote.volumeUp();
        remote.power();
    }
}
