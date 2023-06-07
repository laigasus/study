package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // AbstractDisplay의 하위클래스 인스턴스이므로 상속한 display()를 호출할 수 있음
        d1.display();
        d2.display();
    }
}