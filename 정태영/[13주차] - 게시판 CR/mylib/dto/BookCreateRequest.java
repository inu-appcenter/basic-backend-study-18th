package com.myapp.mylib.dto;

public record BookCreateRequest(
        String title,
        String author,
        Integer publishedYear,
        String category
) {
}
