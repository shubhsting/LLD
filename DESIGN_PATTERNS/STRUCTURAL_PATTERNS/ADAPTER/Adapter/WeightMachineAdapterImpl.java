package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.ADAPTER.Adapter;

import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.ADAPTER.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    public WeightMachine machine;

    public WeightMachineAdapterImpl(WeightMachine machine) {
        this.machine = machine;
    }

    @Override
    public double getWeightInKgs() {
        return machine.getWeightInPounds() * .45;
    }
}
