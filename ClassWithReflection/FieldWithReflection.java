import java.lang.reflect.Field;

public class FieldWithReflection {

    public static void main(String[] args) throws Exception {
        TV tv = new TV("yellow", false, 7);

        callObjStats(tv);

        tv.color = "blue";
        tv.power();
        tv.channelUp();
        tv.channelDown();
        tv.channelDown();

        callObjStats(tv);
    }

    static <T> void callObjStats(T v) throws Exception {
        StringBuilder sb = new StringBuilder();
        Field[] fields = v.getClass().getDeclaredFields();
        for (var field : fields) {
            var value = field.get(v);
            sb.append(field.getName()).append('\t').append(value).append('\n');
        }

        System.out.println(sb);
    }
}