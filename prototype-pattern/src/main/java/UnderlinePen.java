import lombok.AllArgsConstructor;

/**
 * ConcretePrototype（具体的原型）
 *
 * @author duanbt
 * @version 1.0
 **/
@AllArgsConstructor
public class UnderlinePen implements Product {
    private char ulChar;

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
