package behavioural.strategy.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private final List<Subscriber> subscribers;

    public Channel() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.listen();
        }
    }

    public void upload() {
        notifySubscribers();
    }
}
