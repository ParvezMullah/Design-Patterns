/**
 * It lets you create family of related objects without specifying their underlying concrete classes.
 */

package creational.abstract_factory;

import creational.abstract_factory.app.Application;
import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.factory.MacOSFactory;
import creational.abstract_factory.factory.WindowsFactory;

public class Demo {

    private static Application setConfiguration() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = setConfiguration();
        app.paint();
    }
}
