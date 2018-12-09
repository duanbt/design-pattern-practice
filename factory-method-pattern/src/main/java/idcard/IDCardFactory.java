package idcard;

import framework.Factory;
import framework.Product;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteCreator
 * @author duanbt
 * @version 1.0
 **/
public class IDCardFactory extends Factory {
    @Getter
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
