package Java.CreateInstance;

import java.lang.reflect.Field;

public class UsingClone {
    static Book book = new Book("book", 1);
    static Book bookShallowCopy = book;
    static Book bookDeepCopy = book.clone();

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        Field[] fields = UsingClone.class.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);
            sb.append(field.getName()).append(">");
            sb.append(field.get(Book.class).hashCode() == book.hashCode());
            sb.append("\n");
        }

        System.out.print(sb);
        // book>true
        // bookShallowCopy>true
        // bookDeepCopy>false
    }
}