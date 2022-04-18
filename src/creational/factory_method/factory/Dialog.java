package creational.factory_method.factory;

import creational.factory_method.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
