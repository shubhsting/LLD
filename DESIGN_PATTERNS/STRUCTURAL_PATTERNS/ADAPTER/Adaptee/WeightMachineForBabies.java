package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.ADAPTER.Adaptee;

public class WeightMachineForBabies implements WeightMachine {

    @Override
    public double getWeightInPounds() {
        return 28;
    }
}
