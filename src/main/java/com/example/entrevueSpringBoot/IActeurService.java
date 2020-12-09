package com.example.entrevueSpringBoot;

import java.util.Optional;

public interface IActeurService {
    Optional<Acteur> findById(Long id);
    Acteur save(Acteur acteur);
}
