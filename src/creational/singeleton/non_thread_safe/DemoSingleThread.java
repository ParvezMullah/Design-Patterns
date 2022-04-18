package creational.singeleton.non_thread_safe;

public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance("Value1");
        System.out.println(instanceOne);
        Singleton instanceTwo = Singleton.getInstance("Value2");
        System.out.println(instanceTwo);

    }
}
