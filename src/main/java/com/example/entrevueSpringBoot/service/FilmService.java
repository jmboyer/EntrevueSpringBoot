package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.repository.FilmRepository;
import com.example.entrevueSpringBoot.repository.model.Film;
import com.example.entrevueSpringBoot.dto.FilmDTO;
import com.example.entrevueSpringBoot.mapper.FilmMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService implements IFilmService {

  private FilmRepository filmRepository;

  private FilmMapper filmMapper;

  @Autowired
  FilmService(FilmRepository filmRepository, FilmMapper filmMapper) {
    this.filmRepository = filmRepository;
    this.filmMapper = filmMapper;
  }

  @Override
  public FilmDTO createFilm(final FilmDTO filmDTO) {
    Film film = filmMapper.toEntity(filmDTO);

    return filmMapper.toDto(filmRepository.save(film));
  }

  @Override
  public FilmDTO getFilmById(final Long filmId) {
     Optional<Film> filmOptional = filmRepository.findById(filmId);

     return filmOptional.isPresent() ? filmMapper.toDto(filmOptional.get()) : null;
  }

}
