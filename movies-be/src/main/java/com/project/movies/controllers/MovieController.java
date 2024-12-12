package com.project.movies.controllers;

import com.project.movies.domain.dtos.MovieDto;
import com.project.movies.domain.entities.MovieEntity;
import com.project.movies.mappers.Mapper;
import com.project.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;
    private final Mapper<MovieEntity, MovieDto> movieMapper;

    @Autowired
    public MovieController(MovieService movieService, Mapper<MovieEntity, MovieDto> movieMapper) {
        this.movieService = movieService;
        this.movieMapper = movieMapper;
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAllMovie() {
        List<MovieEntity> movieEntities = movieService.getAllMovies();
        List<MovieDto> movieDtos = movieEntities.stream()
                .map(movieMapper::mapTo)
                .toList();
        return ResponseEntity.ok(movieDtos);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<MovieDto> getSingleMovie(@PathVariable("imdbId") String imdbId) {
        return movieService.findMovieByImdbId(imdbId)
                .map(movie -> ResponseEntity.ok(movieMapper.mapTo(movie)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
