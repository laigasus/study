package Prototype;

public class Main {
    enum Events {
        MSG_STRONG("strong message"), BOX_WARN("warning box"), BOX_SLASH("slash box");

        final private String v;

        private Events(String v) {
            this.v = v;
        }
    }

    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        // 등록
        manager.register(Events.MSG_STRONG.v, upen);
        manager.register(Events.BOX_WARN.v, mbox);
        manager.register(Events.BOX_SLASH.v, sbox);

        // 생성과 사용
        for (Events event : Events.values()) {
            manager.create(event.v).use("Hello, world");
        }

        // 대표적으로 ArrayList Obejct.clone(), ModelMapper 있음
    }
}