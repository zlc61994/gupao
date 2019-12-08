import org.junit.Test;

public class LazyTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExcuteTest());
        Thread t2 = new Thread(new ExcuteTest());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
