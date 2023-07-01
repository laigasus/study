import java.util.function.Supplier;

public class UsingSupplier {
    public static void main(String[] args) {
        Supplier<Book> bookSupplier = () -> new Book("java", 1);
        Book book = bookSupplier.get();

        System.out.println(book.name);
    }
}