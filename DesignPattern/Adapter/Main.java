package Adapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("adapter");
        p.printWeak();
        p.printStrong();

        Banner b = new Banner("normal extends");
        b.showWithParen();
        b.showWithAster();
    }
}
