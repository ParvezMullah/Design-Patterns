package creational.factory_method.buttons;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Button Test</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button Clicked!");
    }
}
