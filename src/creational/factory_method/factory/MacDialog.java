package creational.factory_method.factory;

import creational.factory_method.buttons.Button;
import creational.factory_method.buttons.MacButton;

public class MacDialog extends Dialog {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
