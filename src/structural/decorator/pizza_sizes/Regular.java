package structural.decorator.pizza_sizes;

public class Regular implements PizzaSize {

    @Override
    public double getTotalPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Regular";
    }
}
