package class4;

public class BookMain {
    static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello","me");
        book2.displayInfo();

        Book book3 = new Book("jpa","you",178);
        book3.displayInfo();


    }
}
