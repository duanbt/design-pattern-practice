/**
 * 字符串显示类的装饰抽象类
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class Border extends Display {
    /**
     * 被装饰的字符串显示类
     */
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}
