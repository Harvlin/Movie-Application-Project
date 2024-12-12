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
}
