package structural.decorator.add_ons;

import structural.decorator.pizzas.Pizza;

public class Ketchup implements AddOn{
    protected Pizza pizza;
    public Ketchup(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double getTotalPrice() {
        return this.pizza.getTotalPrice() + 2;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", " + "Ketchup";
    }
}
