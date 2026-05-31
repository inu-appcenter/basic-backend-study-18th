package com.example.moviereview.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private String content;
    private Integer rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Builder
    public Review(String content, Integer rating, Movie movie) {
        this.content = content;
        this.rating = rating;
        this.movie = movie;
    }

    public void update(String content, Integer rating) {
        this.content = content;
        this.rating = rating;
    }


}
