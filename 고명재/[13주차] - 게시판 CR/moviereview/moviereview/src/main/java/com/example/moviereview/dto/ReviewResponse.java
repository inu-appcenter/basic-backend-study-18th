package com.example.moviereview.dto;

import com.example.moviereview.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor

public class ReviewResponse {
    private Long id;
    private Long movieId;
    private String content;
    private Integer rating;

    public static ReviewResponse from(Review review) {
        return new ReviewResponse(
                review.getId(),
                review.getMovie().getId(),
                review.getContent(),
                review.getRating()
        );
    }
}
