package com.example.entrevueSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FilmController {

    @Autowired
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @RequestMapping("/api/film/{id}")
    @ResponseBody
    public String getFilmById(@PathVariable Long id) {
        Optional<Film> film = filmService.findById(id);
        return film.toString();
    }

    @PostMapping("/api/film")
    @ResponseBody
    public String addFilm(Film film) {
        Film filmToSave = filmService.save(film);
        return filmToSave.toString();
    }
}