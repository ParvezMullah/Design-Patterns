/*
It lets you attach new behavior to the objects by placing these objects inside special wrapper objects
that contains the behavior.
 */
package structural.decorator;

import structural.decorator.add_ons.Ketchup;
import structural.decorator.pizza_bases.ThinCrust;
import structural.decorator.pizza_sizes.Regular;
import structural.decorator.pizzas.Pizza;
import structural.decorator.toppings.Mushroom;

public class Demo {
    public static void main(String[] args) {
        Pizza pizza = new Mushroom(new Mushroom(new Ketchup(new ThinCrust(new Regular()))));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getTotalPrice());
    }
}
