package com.devdouglas.deployrailway.repository;

import com.devdouglas.deployrailway.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
