package Prototype;

public interface Product extends Cloneable {
    // 독립적인 관계를 위해 MessageBox, UnderlinePen 클래스를 언급하지 않음
    public abstract void use(String s);

    public abstract Product createCopy();
}