package com.example.moviereview.service;

import com.example.moviereview.domain.Movie;
import com.example.moviereview.domain.Review;
import com.example.moviereview.dto.ReviewCreateRequest;
import com.example.moviereview.dto.ReviewResponse;
import com.example.moviereview.dto.ReviewUpdateRequest;
import com.example.moviereview.repository.MovieRepository;
import com.example.moviereview.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;

    @Transactional
    public ReviewResponse create(Long movieId, ReviewCreateRequest request) {
        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() -> new IllegalArgumentException("Movie not found: " + movieId));

        Review review = Review.builder()
                .content(request.getContent())
                .rating(request.getRating())
                .movie(movie)
                .build();

        return ReviewResponse.from(reviewRepository.save(review));
    }

    public List<ReviewResponse> findByMovie(Long movieId) {
        return reviewRepository.findByMovieId(movieId).stream()
                .map(ReviewResponse::from)
                .toList();
    }

    @Transactional
    public ReviewResponse update(Long reviewId, ReviewUpdateRequest request) {
        Review review = reviewRepository.findById(reviewId)
                .orElseThrow(() -> new IllegalArgumentException("Review not found: " + reviewId));
        review.update(request.getContent(), request.getRating());
        return ReviewResponse.from(review);
    }

    @Transactional
    public void delete(Long reviewId) {
        if (!reviewRepository.existsById(reviewId)) {
            throw new IllegalArgumentException("Review not found: " + reviewId);
        }
        reviewRepository.deleteById(reviewId);
    }
}
