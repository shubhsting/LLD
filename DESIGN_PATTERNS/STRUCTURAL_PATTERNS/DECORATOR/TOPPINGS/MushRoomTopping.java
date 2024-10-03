package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.TOPPINGS;

import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.PIZZA.BasePizza;

public class MushRoomTopping extends BasePizza {

    BasePizza pizza;

    public MushRoomTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 30;
    }
}