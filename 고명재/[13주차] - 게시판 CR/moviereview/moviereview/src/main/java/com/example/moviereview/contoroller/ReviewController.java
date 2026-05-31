package com.example.moviereview.contoroller;

import com.example.moviereview.dto.ReviewCreateRequest;
import com.example.moviereview.dto.ReviewResponse;
import com.example.moviereview.dto.ReviewUpdateRequest;
import com.example.moviereview.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/movies/{movieId}/reviews")
    @ResponseStatus(HttpStatus.CREATED)
    public ReviewResponse create(@PathVariable Long movieId,
                                 @RequestBody ReviewCreateRequest request) {
        return reviewService.create(movieId, request);
    }

    @GetMapping("/movies/{movieId}/reviews")
    public List<ReviewResponse> findByMovie(@PathVariable Long movieId) {
        return reviewService.findByMovie(movieId);
    }

    @PutMapping("/reviews/{reviewId}")
    public ReviewResponse update(@PathVariable Long reviewId,
                                 @RequestBody ReviewUpdateRequest request) {
        return reviewService.update(reviewId, request);
    }

    @DeleteMapping("/reviews/{reviewId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long reviewId) {
        reviewService.delete(reviewId);
    }
}