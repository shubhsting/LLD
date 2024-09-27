package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.impl;


import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Coin;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Product;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingMachine;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.State;

public class IdleState extends State {

    public IdleState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void clickOnInsertCoinButton() {
        System.out.println("Clicked on insert coin button!! Please insert money!");
        this.vendingMachine.setVendingMachineState(new AddMoneyState(this.vendingMachine));
    }

    @Override
    public void insertCoin(Coin coin) throws Exception {
        throw new Exception("Insert coin is not allowed in idle state!");
    }

    @Override
    public void chooseProduct(int productNo) throws Exception {
        throw new Exception("Choose product is not allowed in idle state!");
    }

    @Override
    public void clickOnStartProductSelection() throws Exception {
        throw new Exception("Click on Start Product Selection not allowed in idle state!");
    }

    @Override
    public Product dispenseProduct(int productNo) throws Exception {
        throw new Exception("Dispense product is not allowed in idle state!");
    }

    @Override
    public void getChange(Integer amount) throws Exception {
        throw new Exception("Get Change is not allowed in idle state!");
    }
}
