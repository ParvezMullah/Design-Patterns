/**
 * Abstract Factory design patterns provides an interface to create the objects in the superclass
 * but allows the subclasses to alter the type of objects that will be created.
 */

package creational.factory_method;

import creational.factory_method.factory.Dialog;
import creational.factory_method.factory.MacDialog;
import creational.factory_method.factory.WindowDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        String os = System.getProperty("os.name");
        if (os.equalsIgnoreCase("Mac OS X")) {
            dialog = new MacDialog();
        } else {
            dialog = new WindowDialog();
        }

    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
