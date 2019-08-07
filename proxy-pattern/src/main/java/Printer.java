/**
 * @author duanbt
 * @version 1.0
 **/
public class Printer implements Printable {

    private String name;

    public Printer(){
        heavyJob("正在生成Printer实例");
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            System.out.print(".");
        }
        System.out.println("结束。");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成Printer实例(" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String str) {
        System.out.println("=== " + name + " ===");
        System.out.println(str);
    }
}
