package com.myapp.mylib.service;

import com.myapp.mylib.domain.Book;
import com.myapp.mylib.domain.BookStatus;
import com.myapp.mylib.dto.BookCreateRequest;
import com.myapp.mylib.dto.BookResponse;
import com.myapp.mylib.dto.BookUpdateRequest;
import com.myapp.mylib.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BookService {

    private final BookRepository bookRepository;

    public Long create(BookCreateRequest request) {

        Book book = new Book(
                request.title(),
                request.author(),
                request.publishedYear(),
                request.category(),
                BookStatus.AVAILABLE
        );

        return bookRepository.save(book).getId();
    }

    @Transactional(readOnly = true)
    public List<BookResponse> findAll() {

        return bookRepository.findAll()
                .stream()
                .map(book -> new BookResponse(
                        book.getId(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getPublishedYear(),
                        book.getCategory(),
                        book.getStatus()
                ))
                .toList();
    }

    @Transactional
    public void update(
            Long id,
            BookUpdateRequest request
    ) {

        Book book = bookRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("책을 찾을 수 없습니다."));

        book.update(
                request.title()
        );
    }

    @Transactional
    public void delete(Long id) {

        Book book = bookRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("책을 찾을 수 없습니다."));

        bookRepository.delete(book);
    }
}
