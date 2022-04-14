package non_thread_safe;

public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Dat");
        Singleton anotherSingleton = Singleton.getInstance("Ngo");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
