package practice.language;

/**
 * 生成基本命令的接口
 *
 * @author duanbt
 **/
public interface ExecutorFactory {

    Executor createExecutor(String name);
}
