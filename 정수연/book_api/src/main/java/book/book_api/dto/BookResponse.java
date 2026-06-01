package book.book_api.dto;

import book.book_api.domain.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;

//DTO를 JSON으로 바꿀 때 Getter 메서드가 필수로 필요하다
@Getter
public class BookResponse {
    //서버가 DB에서 책을 성공적으로 찾거나 저장한 뒤
    //사용자에게 최종 결과를 보여줄 때
    //화면에 보여줘야 할 모든 정보를 넣는다
    private Long id;
    private String title;
    private String author;
    private int publishedYear;

    public BookResponse(Book book){
        this.id = book.getId();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.publishedYear = book.getPublishedYear();
    }
}
