package creational.abstract_factory.factory;

import creational.abstract_factory.gui_components.button.Button;
import creational.abstract_factory.gui_components.button.WindowsButton;
import creational.abstract_factory.gui_components.checkbox.Checkbox;
import creational.abstract_factory.gui_components.checkbox.WindowsCheckbox;


public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
