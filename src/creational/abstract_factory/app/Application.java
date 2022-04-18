package creational.abstract_factory.app;

import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.gui_components.button.Button;
import creational.abstract_factory.gui_components.checkbox.Checkbox;

public class Application {
    Button button;
    Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
