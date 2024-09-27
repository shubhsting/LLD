package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Coin;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Product;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingMachine;

public abstract class State {
    public VendingMachine vendingMachine;

    public State(VendingMachine machine) {
        this.vendingMachine = machine;
    }

    public abstract void clickOnInsertCoinButton() throws Exception;

    public abstract void insertCoin(Coin coin) throws Exception;

    public abstract void chooseProduct(int productNo) throws Exception;

    public abstract void clickOnStartProductSelection() throws Exception;

    public abstract Product dispenseProduct(int productNo) throws Exception;

    public abstract void getChange(Integer amount) throws Exception;
}
