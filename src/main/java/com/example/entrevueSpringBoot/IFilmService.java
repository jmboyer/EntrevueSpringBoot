package com.example.entrevueSpringBoot;

import java.util.Optional;

public interface IFilmService {
    Optional<Film> findById(Long id);
    Film save(Film film);
}