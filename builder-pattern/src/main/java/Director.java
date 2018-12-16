/**
 * Director
 *
 * @author duanbt
 * @version 1.0
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems("早上好","下午好");
        builder.makeString("晚上");
        builder.makeItems("晚上好", "晚安", "再见");
        builder.close();
    }
}
