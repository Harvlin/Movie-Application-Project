package com.project.movies.mappers.impl;

import com.project.movies.domain.dtos.ReviewDto;
import com.project.movies.domain.entities.ReviewEntity;
import com.project.movies.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapperImpl implements Mapper<ReviewEntity, ReviewDto> {
    private final ModelMapper modelMapper;

    @Autowired
    public ReviewMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ReviewDto mapTo(ReviewEntity reviewEntity) {
        return modelMapper.map(reviewEntity, ReviewDto.class);
    }

    @Override
    public ReviewEntity mapFrom(ReviewDto reviewDto) {
        return modelMapper.map(reviewDto, ReviewEntity.class);
    }
}
