package com.project.movies.mappers.impl;

import com.project.movies.domain.dtos.MovieDto;
import com.project.movies.domain.entities.MovieEntity;
import com.project.movies.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieMapperImpl implements Mapper<MovieEntity, MovieDto> {
    private final ModelMapper modelMapper;

    @Autowired
    public MovieMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public MovieDto mapTo(MovieEntity movieEntity) {
        return modelMapper.map(movieEntity, MovieDto.class);
    }

    @Override
    public MovieEntity mapFrom(MovieDto movieDto) {
        return modelMapper.map(movieDto, MovieEntity.class);
    }
}
