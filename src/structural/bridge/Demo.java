/*
It lets you split large classes or set of closely related classes
into two separate hierarchies-abstraction and implementation
which can be developed independently of each other.
 */

package structural.bridge;

import structural.bridge.devices.TeleVision;
import structural.bridge.remotes.AdvancedRemote;

public class Demo {
    public static void main(String[] args) {
        TeleVision teleVision = new TeleVision();
        AdvancedRemote advancedRemote = new AdvancedRemote(teleVision);
        advancedRemote.setChannel(34);
        advancedRemote.power();
        System.out.println(advancedRemote.device);
        advancedRemote.mute();
        System.out.println(advancedRemote.device);
    }
}
