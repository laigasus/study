package Singleton;

public class Main {
    enum EnumSingleton {
        INSTANCE;

        public void hello() {
            System.out.println("enum을 이용한 Singleton");
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        sb.append("선언된 두 객체는 ");
        sb.append(s1 == s2 ? "같은" : "다른");
        sb.append(" 인스턴스입니다");
        System.out.println(sb);

        EnumSingleton.INSTANCE.hello();
    }
}