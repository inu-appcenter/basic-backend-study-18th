package com.myapp.mylib.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/** ==NoArgsConstructor(access = AccessLevel.PROTECTED)
 * protected로 생성자를 만들어줘서
 * JPA 말고 다른 곳에서 생성자를
 * 사용할 수 없도록 만들어줌
 */

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private Integer publishedYear; // jpa는 null이 가능한 래퍼 클래스를 사용

    @Column(nullable = false)
    private String category;

    @Enumerated(EnumType.STRING) // DB에서 enum을 인식하게 해줌 -> 이름이 뜸
    @Column(nullable = false)
    private BookStatus status;

    public Book( // 서비스에서 request -> entity 옮길 때 사용
            String title,
            String author,
            Integer publishedYear,
            String category,
            BookStatus status
    ) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.category = category;
        this.status = status;
    }

    public void update(String title){
        this.title = title;
    }
}
