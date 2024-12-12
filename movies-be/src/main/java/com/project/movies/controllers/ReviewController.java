package com.project.movies.controllers;

import com.project.movies.domain.dtos.ReviewDto;
import com.project.movies.domain.entities.ReviewEntity;
import com.project.movies.mappers.Mapper;
import com.project.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {

    private final ReviewService reviewService;
    private final Mapper<ReviewEntity, ReviewDto> reviewMapper;

    @Autowired
    public ReviewController(ReviewService reviewService, Mapper<ReviewEntity, ReviewDto> reviewMapper) {
        this.reviewService = reviewService;
        this.reviewMapper = reviewMapper;
    }

    @PostMapping
    public ResponseEntity<ReviewDto> createReview(@RequestBody Map<String, String> payload) {
        ReviewEntity createdReviewEntity = reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId"));
        ReviewDto reviewDto = reviewMapper.mapTo(createdReviewEntity);
        return new ResponseEntity<>(reviewDto, HttpStatus.CREATED);
    }
}
