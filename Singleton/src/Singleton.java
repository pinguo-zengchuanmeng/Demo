import java.util.Random;

/**
 * Created by zengchuanmeng on 2017/8/8.
 */
public class Singleton {

    private int i = new Random(5);
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton get() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello everyone");
    }
}
