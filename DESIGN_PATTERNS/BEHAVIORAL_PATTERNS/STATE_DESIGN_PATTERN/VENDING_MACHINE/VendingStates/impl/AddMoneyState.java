package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.impl;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Coin;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Product;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingMachine;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.State;

public class AddMoneyState extends State {

    public AddMoneyState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    
    @Override
    public void clickOnInsertCoinButton() throws Exception {
        throw new Exception("Insert coin is not allowed in idle state!");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Added coin of value: " + coin.name());
        vendingMachine.coinsList.add(coin);
    }

    @Override
    public void chooseProduct(int productNo) throws Exception {
        throw new Exception("Choose product is not allowed in ass money state!");
    }

    @Override
    public void clickOnStartProductSelection() throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState(vendingMachine));
    }

    @Override
    public Product dispenseProduct(int productNo) throws Exception {
        throw new Exception("Dispense product is not allowed in ass money state!");
    }

    @Override
    public void getChange(Integer amount) throws Exception {
        throw new Exception("get change is not allowed in ass money state!");
    }
}

