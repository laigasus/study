package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("Node.js 백엔드 개발자 되기"));
        bookShelf.appendBook(new Book("Spring in Action"));
        bookShelf.appendBook(new Book("Java 언어로 배우는 디자인 패턴 입문"));

        // 명시적으로 Iterator를 사용
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            sb.append(book.getName()).append('\n');
        }
        sb.append('\n');

        // Iterable 인터페이스의 default 메서드. Stream.forEach는 기본 for-loop와 다름!
        bookShelf.forEach(book -> sb.append(book.getName()).append('\n'));
        sb.append('\n');

        // 확장 for문(내부적으로 Iterator패턴이 사용된 것임)
        for (Book book : bookShelf) {
            sb.append(book.getName()).append('\n');
        }
        sb.append('\n');

        System.out.print(sb);
    }
}