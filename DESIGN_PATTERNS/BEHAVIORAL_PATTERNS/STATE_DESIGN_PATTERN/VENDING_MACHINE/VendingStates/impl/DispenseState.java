package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.impl;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Coin;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Product;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.ProductShelf;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingMachine;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.State;

public class DispenseState extends State {

    public DispenseState(VendingMachine vendingMachine, int productNo) {
        super(vendingMachine);
        dispenseProduct(productNo);
    }
    @Override
    public void clickOnInsertCoinButton() throws Exception {
        throw new Exception("Click on Insert Coin Button not allowed in dispense state!");
    }

    @Override
    public void insertCoin( Coin coin) throws Exception {
        throw new Exception("Click on Insert Coin Button not allowed in dispense state!");
    }

    @Override
    public void clickOnStartProductSelection() throws Exception {
        throw new Exception("Click on Start Product Selection not allowed in dispense state!");
    }

    @Override
    public void chooseProduct(int productNo) throws Exception {
        throw new Exception("Click on Choose product not allowed in dispense state!");
    }

    @Override
    public Product dispenseProduct(int productNo) {
        ProductShelf productShelf = null;
        for (ProductShelf shelf : vendingMachine.productInventory.productShelfs) {
            if (shelf.codeNumber == productNo)
                productShelf = shelf;
        }
        productShelf.count = productShelf.count - 1;
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return productShelf.product;
    }

    @Override
    public void getChange(Integer amount) throws Exception {
        throw new Exception("Click on Start Product Selection not allowed in dispense state!");
    }
}
