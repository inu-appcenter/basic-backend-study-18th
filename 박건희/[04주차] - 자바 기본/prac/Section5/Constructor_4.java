package Section5;

public class Constructor_4 {

    static void main() {

        // Q1.
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();

    }

}
