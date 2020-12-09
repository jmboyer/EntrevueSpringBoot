package com.example.entrevueSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmService implements IFilmService {

    @Autowired
    private FilmRepository filmRepository;

    @Override
    public Optional<Film> findById(Long id) {
        return filmRepository.findById(id);
    }

    @Override
    public Film save(Film film) {
        return filmRepository.save(film);
    }
}