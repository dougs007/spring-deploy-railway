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
@RequestMapping("/")
@AllArgsConstructor
public class DeployRailwayController {

    @GetMapping
    public ResponseEntity<String> app() {
        return ResponseEntity.ok().body("Welcome to DeployRailwayApplication :) ");
    }
}
