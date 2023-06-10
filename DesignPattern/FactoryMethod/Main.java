package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("엄");
        Product card2 = factory.create("준");
        Product card3 = factory.create("식");

        card1.use();
        card2.use();
        card3.use();

        // Java9 부터 지원하는 List.of("A", "B"); 는 정적 팩토리 메서드를 활용한 것이다
        // Arrays.asList(), String.valueOf, java.time.Instant.now() 또한 마찬가지
    }
}