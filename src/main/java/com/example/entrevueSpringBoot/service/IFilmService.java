package com.example.entrevueSpringBoot.service;

import com.example.entrevueSpringBoot.dto.FilmDTO;

public interface IFilmService {

  FilmDTO createFilm(FilmDTO filmDTO);

  FilmDTO getFilmById(final Long filmId);
}
