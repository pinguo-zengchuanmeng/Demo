import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengchuanmeng on 2017/8/8.
 */
public class Client {
    public static void main(String args[]) {
        List<Girl> girlList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            girlList.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(girlList));
    }
}
