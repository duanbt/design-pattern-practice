/**
 * @program: design-pattern-practice
 * @description: 集合接口
 * @author: duanbt
 * @create: 2018-11-25 21:54
 **/
public interface Aggregate<E> {
    Iterator<E> iterator();
}
