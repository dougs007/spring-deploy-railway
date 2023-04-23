package com.devdouglas.deployrailway.controller;

import com.devdouglas.deployrailway.model.Genre;
import com.devdouglas.deployrailway.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
@AllArgsConstructor
public class GenreController {
    private final GenreService service;

    @GetMapping
    public ResponseEntity<List<Genre>> all() {
        List<Genre> dto = service.all();
        return ResponseEntity.ok().body(dto);
    }
}
