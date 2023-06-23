package Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    // 클래스 외부에서 new 되지 않도록 private 생성자 선언
    private Singleton() {
        System.out.println("Singeton 인스턴스 생성");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}