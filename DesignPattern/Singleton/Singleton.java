package Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Singeton 인스턴스 생성");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}