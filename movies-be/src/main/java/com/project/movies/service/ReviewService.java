package com.project.movies.service;

import com.project.movies.domain.entities.ReviewEntity;

public interface ReviewService {

    ReviewEntity createReview(String reviewBody, String imdbId);

}
