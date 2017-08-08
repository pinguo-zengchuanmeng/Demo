/**
 * Created by zengchuanmeng on 2017/8/8.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton get() {
        return instance;
    }
}
