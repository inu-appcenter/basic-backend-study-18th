package com.myapp.mylib.dto;

import com.myapp.mylib.domain.BookStatus;

public record BookResponse(
        Long id,
        String title,
        String author,
        Integer publishedYear,
        String category,
        BookStatus status
) {
}