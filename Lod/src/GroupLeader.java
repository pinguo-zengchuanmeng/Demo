import java.util.List;

/**
 * Created by zengchuanmeng on 2017/8/8.
 */
public class GroupLeader {
    private List<Girl> mListGirls;

    public GroupLeader(List<Girl> _listGirls) {
        this.mListGirls = _listGirls;
    }

    public void counterGirls() {
        System.out.println("女生数量是：" + mListGirls.size());
    }
}
