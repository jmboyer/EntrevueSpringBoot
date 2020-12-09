package com.example.entrevueSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActeurService implements IActeurService {

    @Autowired
    private ActeurRepository acteurRepository;


    @Override
    public Optional<Acteur> findById(Long id) {
        return acteurRepository.findById(id);
    }

    @Override
    public Acteur save(Acteur acteur) {
        return acteurRepository.save(acteur);
    }
}