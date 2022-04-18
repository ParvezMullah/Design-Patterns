package creational.abstract_factory.gui_components.checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOs Checkbox Painted!");
    }
}
