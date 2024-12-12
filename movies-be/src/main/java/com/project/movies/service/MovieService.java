package com.project.movies.service;

import com.project.movies.domain.entities.MovieEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MovieService {

    List<MovieEntity> getAllMovies();

    Optional<MovieEntity> getSingleMovie(UUID movieId);

    Optional<MovieEntity> findMovieByImdbId(String imdbId);
}
