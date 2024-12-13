package com.project.movies.domain.dtos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsContructor
@NoArgsConstructor
@Builder
public class MovieDto {
    UUID movieId;

    String imdbId;

    String title;

    String releaseDate;

    String trailerLink;

    String poster;

    List<String> genres;

    List<String> backdrops;

    List<ReviewDto> reviews;
}
