package creational.singeleton.non_thread_safe;

public final class Singleton {
    private static Singleton instance;
    public String value;

    public Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singelaton{" +
                "value='" + value + '\'' +
                '}';
    }
}
