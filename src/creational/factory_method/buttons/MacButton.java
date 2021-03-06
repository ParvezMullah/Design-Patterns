package creational.factory_method.buttons;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("<button> Test Button </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Mac Button Clicked!");
    }
}
