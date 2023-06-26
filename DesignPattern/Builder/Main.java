package Builder;

public class Main {
    public static void main(String[] args) {
        args = new String[] { "text" };

        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getTextResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getHTMLResult();
            System.out.println("HTML파일 " + filename + "이 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }

    }

    public static void usage() {
        System.out.println("Usage: hava Main text\t 텍스트로 문서 작성");
        System.out.println("Usage: hava Main html\t HTML 파일로 문서 작성");
    }

    // 대표적으로 StringBuilder가 있음

    // 고정된 매개변수 생성자의 경우 순차적 대입, 혹은 다른 생성자를 추가 생성해야 함
    // new Person(int age, int height, String name);

    // Builder의 경우 필요한 만큼 매개변수 삽입. 순서 제약 없어 유연함
    // Person.builder().name("hong").age(2).height(222).build();
}