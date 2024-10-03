package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.TOPPINGS;

import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.PIZZA.BasePizza;

public class ExtraCheeseTopping extends BasePizza {

    BasePizza pizza;

    public ExtraCheeseTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
