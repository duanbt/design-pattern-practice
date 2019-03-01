/**
 * 解决问题的具体类（解决编号小于制定编号的问题）
 *
 * @author duanbt
 * @version 1.0
 **/
public class LimitSupport extends Support {
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() < limit){
            return true;
        }else {
            return false;
        }
    }
}
