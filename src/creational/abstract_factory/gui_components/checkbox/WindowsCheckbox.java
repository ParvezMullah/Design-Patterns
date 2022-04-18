package creational.abstract_factory.gui_components.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox Painted!");
    }
}
