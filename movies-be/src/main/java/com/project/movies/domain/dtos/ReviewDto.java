package com.project.movies.domain.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.util.UUID;

@Data
@AllArgsContructor
@NoArgsConstructor
@Builder
public class ReviewDto {
    UUID reviewId;

    String body;

    @JsonIgnore
    MovieDto movieDto;

    public ReviewDto() {
    }

    public ReviewDto(UUID reviewId, String body, MovieDto movieDto) {
        this.reviewId = reviewId;
        this.body = body;
        this.movieDto = movieDto;
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

    public MovieDto getMovieDto() {
        return movieDto;
    }

    public void setMovieDto(MovieDto movieDto) {
        this.movieDto = movieDto;
    }
}
