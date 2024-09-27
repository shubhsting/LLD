package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE;

import java.util.ArrayList;
import java.util.List;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.State;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.impl.IdleState;

public class VendingMachine {
    State currentState;
    public Inventory productInventory;
    public List<Coin> coinsList;

    public VendingMachine(Inventory productInventory) {
        this.currentState = new IdleState(this);
        this.coinsList = new ArrayList<>();
        this.productInventory = productInventory;
    }

    public void setVendingMachineState(State state) {
        this.currentState = state;
    }

    public State getVendingMachineState() {
        return this.currentState;
    }

    public void clickOnInsertCoinButton() throws Exception {
        State state = getVendingMachineState();
        state.clickOnInsertCoinButton();
    }

    public void insertCoin(Coin coin) throws Exception {
        State state = getVendingMachineState();
        state.insertCoin(coin);
    }

    public void clickOnStartProductSelection() throws Exception {
        State state = getVendingMachineState();
        state.clickOnStartProductSelection();
    }

    public void enterProductCode(int productNo) throws Exception {
        State state = getVendingMachineState();
        state.chooseProduct(productNo);
    }
}
