package creational.abstract_factory.factory;

import creational.abstract_factory.gui_components.button.Button;
import creational.abstract_factory.gui_components.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
