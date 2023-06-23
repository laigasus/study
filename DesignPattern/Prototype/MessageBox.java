package Prototype;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        StringBuilder sb = new StringBuilder();
        int decolen = 1 + s.length() + 1;

        sb.append(String.valueOf(decochar).repeat(decolen)).append('\n');
        sb.append(decochar + s + decochar).append('\n');
        sb.append(String.valueOf(decochar).repeat(decolen)).append('\n');

        System.out.print(sb);
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