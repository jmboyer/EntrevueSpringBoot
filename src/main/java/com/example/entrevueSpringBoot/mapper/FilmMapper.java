package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.repository.model.Film;
import com.example.entrevueSpringBoot.dto.FilmDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FilmMapper {

  Film toEntity (FilmDTO filmDTO);

  FilmDTO toDto (Film film);

}
