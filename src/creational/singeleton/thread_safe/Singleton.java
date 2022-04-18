package creational.singeleton.thread_safe;

public final class Singleton {
    private static Singleton instance;
    public String value;

    public Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

    @Override
    public String toString() {
        return "Singelaton{" +
                "value='" + value + '\'' +
                '}';
    }
}
