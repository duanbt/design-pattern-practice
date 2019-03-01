/**
 * 解决问题的具体类（解决奇数编号问题）
 *
 * @author duanbt
 * @version 1.0
 **/
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() % 2 == 1 ){
            return true;
        }else {
        return false;
        }
    }
}
