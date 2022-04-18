package creational.abstract_factory.gui_components.button;

public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("MacOs Button Painted!");
    }
}
