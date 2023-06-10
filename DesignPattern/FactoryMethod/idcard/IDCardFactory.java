package FactoryMethod.idcard;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);

    }

    @Override
    public void registerProduct(Product product) {
        System.out.println(product + "등록");
    }

}
