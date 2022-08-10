package behavioural.strategy.observer;

public class Subscriber {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void listen() {
        System.out.println(name + " Listened!");
    }
}
