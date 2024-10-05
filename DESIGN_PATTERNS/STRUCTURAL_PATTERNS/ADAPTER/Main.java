package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.ADAPTER;

import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.ADAPTER.Adaptee.WeightMachineForBabies;
import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.ADAPTER.Adapter.WeightMachineAdapter;
import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.ADAPTER.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(adapter.getWeightInKgs());
    }
}
