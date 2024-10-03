package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR;

import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.PIZZA.BasePizza;
import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.PIZZA.VegDelight;
import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.TOPPINGS.ExtraCheeseTopping;
import DESIGN_PATTERNS.STRUCTURAL_PATTERNS.DECORATOR.TOPPINGS.MushRoomTopping;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheeseTopping(new MushRoomTopping(new VegDelight()));
        System.out.println(pizza.cost());
    }
}
