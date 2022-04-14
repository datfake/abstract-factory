package thread_safe;

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

    public synchronized static Singleton getInstance(String value) {
//        Singleton result = INSTANCE;
//        if (result != null) {
//            return result;
//        }
//        synchronized (Singleton.class) {
//            if (INSTANCE == null) {
//                INSTANCE =  new Singleton(value);
//            }
//            return INSTANCE;
//        }
        if (INSTANCE == null) {
            INSTANCE =  new Singleton(value);
        }
        return INSTANCE;
    }
}
