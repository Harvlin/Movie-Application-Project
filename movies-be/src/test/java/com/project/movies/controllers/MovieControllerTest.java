package com.project.movies.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.movies.service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class MovieControllerTest {

    private final String MOVIE_BASE_URL = "api/v1/movies";
    private final MockMvc mockMvc;
    private final MovieService movieService;
    private final ObjectMapper objectMapper;

    @Autowired
    public MovieControllerTest(MockMvc mockMvc, MovieService movieService, ObjectMapper objectMapper) {
        this.mockMvc = mockMvc;
        this.movieService = movieService;
        this.objectMapper = objectMapper;
    }

    @Test
    public void testThatGetAllMovieSuccessfullyReturnHttp200Ok() throws Exception {

    }
}
