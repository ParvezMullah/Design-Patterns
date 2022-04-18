package creational.abstract_factory.factory;

import creational.abstract_factory.gui_components.button.Button;
import creational.abstract_factory.gui_components.button.MacOsButton;
import creational.abstract_factory.gui_components.checkbox.Checkbox;
import creational.abstract_factory.gui_components.checkbox.MacOsCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
