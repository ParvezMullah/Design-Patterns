package structural.decorator.toppings;

import structural.decorator.pizzas.Pizza;

public class Mushroom implements Topping {
    protected Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getTotalPrice() {
        return this.pizza.getTotalPrice() + 2;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", " + "Mushroom";
    }
}
