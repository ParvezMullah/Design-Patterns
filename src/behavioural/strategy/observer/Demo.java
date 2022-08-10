package behavioural.strategy.observer;

public class Demo {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber sub1 = new Subscriber("Alice");
        Subscriber sub2 = new Subscriber("Bob");
        channel.subscribe(sub1);
        channel.subscribe(sub2);

        channel.upload();

        channel.unsubscribe(sub2);
        channel.upload();

    }
}
