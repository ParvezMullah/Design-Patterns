package creational.abstract_factory.gui_components.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button Painted!");
    }
}