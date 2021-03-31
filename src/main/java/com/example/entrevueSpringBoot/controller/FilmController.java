package com.example.entrevueSpringBoot.controller;


import com.example.entrevueSpringBoot.dto.FilmDTO;
import com.example.entrevueSpringBoot.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

  IFilmService filmService;

  @Autowired
  public FilmController(IFilmService filmService) {
    this.filmService = filmService;
  }

  @PostMapping(value = "api/film", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<FilmDTO> createFilm(@RequestBody FilmDTO filmDTO) {
    return ResponseEntity.status(HttpStatus.CREATED).body(filmService.createFilm(filmDTO));
  }

  @GetMapping(value = "api/film/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<FilmDTO> getFilmById(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(filmService.getFilmById(id));
  }
}
