package com.example.moviereview.dto;

import com.example.moviereview.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class MovieResponse {
    private Long id;
    private String title;
    private String director;

    public static MovieResponse from(Movie movie){
        return new MovieResponse(movie.getId(),movie.getTitle(),movie.getDirector());
    }
}
