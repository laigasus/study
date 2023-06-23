package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    // 독립적인 관계를 위해 MessageBox, UnderlinePen 클래스를 언급하지 않음
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}