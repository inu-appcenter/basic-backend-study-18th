package com.example.moviereview.service;

import com.example.moviereview.domain.Movie;
import com.example.moviereview.dto.MovieCreateRequest;
import com.example.moviereview.dto.MovieResponse;
import com.example.moviereview.dto.MovieUpdateRequest;
import com.example.moviereview.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MovieService {
    private final MovieRepository movieRepository;

    @Transactional
    public MovieResponse create(MovieCreateRequest request){
        Movie saved = movieRepository.save(request.toEntity());
        return MovieResponse.from(saved);
    }

    public List<MovieResponse> findAll(){
        return movieRepository.findAll().stream()
                .map(MovieResponse::from)
                .toList();
    }
    public MovieResponse findById(Long id) {
        return MovieResponse.from(getMovie(id));
    }

    @Transactional
    public MovieResponse update(Long id, MovieUpdateRequest request) {
        Movie movie = getMovie(id);
        movie.update(request.getTitle(), request.getDirector());
        return MovieResponse.from(movie);
    }
    @Transactional
    public void delete(Long id) {
        if (!movieRepository.existsById(id)) {
            throw new IllegalArgumentException("Movie not found: " + id);
        }
        movieRepository.deleteById(id);
    }

    private Movie getMovie(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Movie not found: " + id));
    }

}
