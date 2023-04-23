package com.devdouglas.deployrailway.service;

import com.devdouglas.deployrailway.model.Genre;
import com.devdouglas.deployrailway.repository.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GenreService {
    private final GenreRepository repository;

    public List<Genre> all() {
        return repository.findAll();
    }
}
