package creational.singeleton.thread_safe;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you See two different values then singelaton is not thread safe! " + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    public static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton instance = Singleton.getInstance("FOO");
            System.out.println(instance);
        }
    }

    public static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton instance = Singleton.getInstance("BAR");
            System.out.println(instance);
        }
    }
}
