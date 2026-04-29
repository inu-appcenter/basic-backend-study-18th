package class4;

public class Book {
    String title;
    String author;
    int page;

    // 기본 constructor
    Book(){
        this("","",0);
    }

    // 2개의 필드만 받는 constructor
    Book(String title, String author){
        this(title,author,0);
    }

    // 모든 필드를 받는 constructor
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: "+title+"저자: "+author+"페이지: "+page);
    }
}
