package Java.ClassWithReflection;

import java.lang.reflect.Field;

public class TV {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

    public TV(Object... obj) throws IllegalAccessException {

        // 단순 this 삽입
        this.color = (String) obj[0];
        this.power = (boolean) obj[1];
        this.channel = (int) obj[2];

        // reflection 사용
        Field[] fields = this.getClass().getDeclaredFields();
        for (int i = 0; i < obj.length; i++) {
            fields[i].set(this, obj[i]);
        }

        // instance of 사용
        for (Object o : obj) {
            if (o instanceof String) {
                this.color = (String) o;
            } else if (o instanceof Boolean) {
                this.power = (boolean) o;
            } else if (o instanceof Integer) {
                this.channel = (int) o;
            }
        }
    }
}