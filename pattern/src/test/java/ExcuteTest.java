import singleton.lazy.LazySingleton;

public class ExcuteTest implements Runnable {


    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
