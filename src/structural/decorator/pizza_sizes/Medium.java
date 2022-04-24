package structural.decorator.pizza_sizes;

public class Medium implements PizzaSize {
    @Override
    public double getTotalPrice() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Medium ";
    }
}
