package Prototype;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        StringBuilder sb = new StringBuilder();
        int ulen = s.length();
        sb.append(s).append('\n');
        sb.append(String.valueOf(ulchar).repeat(ulen));
        System.out.println(sb);
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}