package book.book_api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor // JSON 데이터를 자바 객체로 변환할 때 꼭 필요한 기본 생성자
public class BookCreateRequest {
    private String title;
    private String author;
    private int publishedYear;
}
