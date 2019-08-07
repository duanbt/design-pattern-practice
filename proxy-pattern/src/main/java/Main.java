/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Printable printer = new PrinterProxy("Ace");
        System.out.println(printer.getPrinterName());
        printer.setPrinterName("Bob");
        System.out.println(printer.getPrinterName());
        printer.print("Hello");
    }
}
