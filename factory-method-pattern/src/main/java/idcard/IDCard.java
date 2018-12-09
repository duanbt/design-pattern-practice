package idcard;

import framework.Product;
import lombok.Getter;

/**
 * ConcreteProduct
 * @author duanbt
 * @version 1.0
 **/
public class IDCard extends Product {
    @Getter
    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
}