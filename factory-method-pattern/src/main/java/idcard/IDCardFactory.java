package idcard;

import framework.Factory;
import framework.Product;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * ConcreteCreator
 * @author duanbt
 * @version 1.0
 **/
public class IDCardFactory extends Factory {
    @Getter
    private Map<Integer, String> database = new HashMap<>();
    private int serial = 100;
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        database.put(idCard.getSerial(), idCard.getOwner());
    }
}
