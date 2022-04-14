package non_thread_safe;

public class Singleton {
    private static Singleton INSTANCE;
    public String value;

    public Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (INSTANCE == null) {
            INSTANCE =  new Singleton(value);
        }
        return INSTANCE;
    }
}
