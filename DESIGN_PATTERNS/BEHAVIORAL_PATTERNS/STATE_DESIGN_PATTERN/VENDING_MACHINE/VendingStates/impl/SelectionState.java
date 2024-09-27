package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.impl;

import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Coin;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.Product;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.ProductShelf;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingMachine;
import DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE.VendingStates.State;

public class SelectionState extends State {

    public SelectionState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public void clickOnInsertCoinButton() throws Exception {
        throw new Exception("Click on insert button is not allowed in selection state!");
    }

    @Override
    public void insertCoin( Coin coin) throws Exception {
        throw new Exception("Insert coin is not allowed in selection state!");
    }

    @Override
    public void chooseProduct(int productNo) throws Exception {
        int totalAmount = 0;
        for (Coin coin : vendingMachine.coinsList)
            totalAmount += coin.value;
        ProductShelf productShelf = null;
        for (ProductShelf shelf : vendingMachine.productInventory.productShelfs) {
            if (shelf.codeNumber == productNo)
                productShelf = shelf;
        }
        if (productShelf == null)
            throw new Exception("The product is not present");
        if (productShelf.count == 0)
            throw new Exception("The item is sold out!");
        if (productShelf.product.cost > totalAmount)
            throw new Exception("Not Enough money to purchase product!");
        if (productShelf.product.cost < totalAmount)
            getChange(totalAmount - productShelf.product.cost);
        vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, productNo));
    }

    @Override
    public void clickOnStartProductSelection() throws Exception {
        throw new Exception("Click on Start Product Selection not allowed in selection state!");
    }

    @Override
    public Product dispenseProduct(int productNo) throws Exception {
        throw new Exception("Dispense product is not allowed in selection state!");
    }

    @Override
    public void getChange(Integer amount) throws Exception {
        System.out.println("returning change of RS: " + amount);
    }
}
