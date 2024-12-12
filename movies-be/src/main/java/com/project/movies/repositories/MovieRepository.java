package com.project.movies.repositories;

import com.project.movies.domain.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, UUID> {
    Optional<MovieEntity> findMovieByImdbId(String imdbId);
}
