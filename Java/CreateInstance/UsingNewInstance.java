package Java.CreateInstance;

public class UsingNewInstance {
    public static void main(String[] args) throws Exception {
        Class[] cArgs = { String.class, int.class };
        Book book = (Book) Book.class.getDeclaredConstructor(cArgs).newInstance("java", 1);

        System.out.println(book.name);
        // java
    }
}