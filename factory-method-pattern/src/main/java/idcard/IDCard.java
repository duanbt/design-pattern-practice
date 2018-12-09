package idcard;

import framework.Product;
import lombok.Getter;

/**
 * ConcreteProduct
 *
 * @author duanbt
 * @version 1.0
 **/
public class IDCard extends Product {
    @Getter
    private String owner;
    @Getter
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println("制作" + owner + "(" + serial + ")" + "的ID卡");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
}
