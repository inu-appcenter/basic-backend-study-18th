package extends1.ex;

public class ShopMain {

    public static void main(String[] args) {

        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("OK Computer", 15000, "radiohead");
        Movie movie = new Movie("Project Hail Mary", 18000, "phil Load", "Ryan Gosling");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}
