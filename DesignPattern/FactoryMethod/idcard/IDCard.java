package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {
    String owner;

    public IDCard(String owner) {
        System.out.println(owner + "카드 생성");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "사용");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
