package com.project.movies.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "reviews")
@Data
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID reviewId;

    @Column(nullable = false)
    private String body;

    @Getter
    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private MovieEntity movieEntity;

    public ReviewEntity(String body) {
        this.body = body;
    }

    public ReviewEntity(UUID reviewId, String body, MovieEntity movieEntity) {
        this.reviewId = reviewId;
        this.body = body;
        this.movieEntity = movieEntity;
    }

    public ReviewEntity() {
    }

    public UUID getReviewId() {
        return reviewId;
    }

    public void setReviewId(UUID reviewId) {
        this.reviewId = reviewId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public MovieEntity getMovieEntity() {
        return movieEntity;
    }

    public void setMovieEntity(MovieEntity movieEntity) {
        this.movieEntity = movieEntity;
    }
}
