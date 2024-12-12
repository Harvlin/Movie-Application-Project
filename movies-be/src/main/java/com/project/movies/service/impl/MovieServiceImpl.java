package com.project.movies.service.impl;

import com.project.movies.domain.entities.MovieEntity;
import com.project.movies.repositories.MovieRepository;
import com.project.movies.service.MovieService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieEntity> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<MovieEntity> getSingleMovie(UUID movieId) {
        return movieRepository.findById(movieId);
    }

    @Override
    public Optional<MovieEntity> findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
