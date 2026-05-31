package com.example.moviereview.dto;

import com.example.moviereview.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor @AllArgsConstructor
public class MovieCreateRequest {
    private String title;
    private String director;

    public Movie toEntity(){
        return Movie.builder().title(title).director(director).build();
    }


}
