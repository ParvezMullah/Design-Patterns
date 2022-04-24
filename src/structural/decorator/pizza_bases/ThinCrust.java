package structural.decorator.pizza_bases;

import structural.decorator.pizzas.Pizza;

public class ThinCrust implements PizzaBase {

    protected Pizza pizza;

    public ThinCrust(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getTotalPrice() {
        return this.pizza.getTotalPrice() + 5;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", " + "Thin Crush";
    }
}
