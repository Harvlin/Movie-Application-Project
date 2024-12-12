package com.project.movies.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "reviews")
@AllArgsConstructor
@NoArgsConstructor
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

    public void setMovieEntity(MovieEntity movieEntity) {
        this.movieEntity = movieEntity;
    }
}
