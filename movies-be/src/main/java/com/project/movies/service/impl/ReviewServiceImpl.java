package com.project.movies.service.impl;

import com.project.movies.domain.entities.MovieEntity;
import com.project.movies.domain.entities.ReviewEntity;
import com.project.movies.repositories.MovieRepository;
import com.project.movies.repositories.ReviewRepository;
import com.project.movies.service.ReviewService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository, MovieRepository movieRepository) {
        this.reviewRepository = reviewRepository;
        this.movieRepository = movieRepository;
    }

    public ReviewEntity createReview(String reviewBody, String imdbId) {
        MovieEntity movie = movieRepository.findMovieByImdbId(imdbId)
                .orElseThrow(() -> new EntityNotFoundException("Movie not found with imdbId: " + imdbId));

        ReviewEntity review = new ReviewEntity(reviewBody);
        review.setMovieEntity(movie);
        reviewRepository.save(review);

        movie.getReviews().add(review);
        movieRepository.save(movie);

        return review;
    }
}
