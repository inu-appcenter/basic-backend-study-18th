package com.example.moviereview.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;

    @Builder
    public Movie(String title, String director){
        this.title = title;
        this.director = director;
    }

    public void update(String title, String director){
        this.title = title;
        this.director = director;
    }
}
