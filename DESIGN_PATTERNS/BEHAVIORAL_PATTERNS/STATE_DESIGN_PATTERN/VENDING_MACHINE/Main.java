package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE;


public class Main {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.fetchRemainingInventory();
        VendingMachine machine = new VendingMachine(inventory);
        machine.clickOnInsertCoinButton();
        machine.insertCoin(Coin.HUNDRED);
        machine.clickOnStartProductSelection();
        machine.enterProductCode(2);
        inventory.fetchRemainingInventory();
    }
}
