package DESIGN_PATTERNS.BEHAVIORAL_PATTERNS.STATE_DESIGN_PATTERN.VENDING_MACHINE;

public class ProductShelf {
    public Integer codeNumber;
    public Product product;
    public int count;

    public ProductShelf(Integer codeNumber, Product product, int count) {
        this.codeNumber = codeNumber;
        this.product = product;
        this.count = count;
    }
}
