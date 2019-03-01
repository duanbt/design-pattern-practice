/**
 * 解决问题的具体类（只解决指定编号的问题）
 *
 * @author duanbt
 * @version 1.0
 **/
public class SpecialSupport extends Support {
    private int number;
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == number){
            return true;
        }else {
        return false;
        }
    }
}
