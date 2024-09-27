package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<ProductShelf> productShelfs;

    public Inventory() {
        this.productShelfs = new ArrayList<>();
        initialise();
    }

    private void initialise() {
        Product[] products = { new Product("Coke Can", 20), new Product("Parle G", 10), new Product("Fruit Cake", 50),
                new Product("Fruiti", 30) };
        for (int index = 0; index < products.length; index++) {
            productShelfs.add(new ProductShelf(index, products[index], index + 1));
        }
    }
    public void fetchRemainingInventory() {
        for(ProductShelf productShelf: productShelfs) {
            System.out.println("Product Name: " + productShelf.product.name + " Remaining quantity: " + productShelf.count);
        }
    }
}
