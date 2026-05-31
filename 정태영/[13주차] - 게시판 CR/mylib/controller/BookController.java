package com.myapp.mylib.controller;

import com.myapp.mylib.dto.BookCreateRequest;
import com.myapp.mylib.dto.BookResponse;
import com.myapp.mylib.dto.BookUpdateRequest;
import com.myapp.mylib.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/books/create")
    public Long create(@RequestBody BookCreateRequest request) {
        return bookService.create(request);
    }

    @GetMapping("/books")
    public List<BookResponse> findAll() {
        return bookService.findAll();
    }

    @DeleteMapping("/books/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

    @PatchMapping("/books/{id}")
    public void update(
            @PathVariable Long id,
            @RequestBody BookUpdateRequest request
    ) {
        bookService.update(id, request);
    }
}
