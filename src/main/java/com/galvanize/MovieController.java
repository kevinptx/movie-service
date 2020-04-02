package com.galvanize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    //this is what @Autowired is doing:
//    public MovieController(MovieService movieService){
//        this.movieService = movieService;
//    }

    @Autowired
    MovieRepository repository;

    @GetMapping("/api/movies")
    public ResponseEntity <List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @PostMapping("/api/movies")
    public Movie createMovie(@RequestBody Movie movie){
        Movie newMovie = repository.save(movie);
        return newMovie;
    }
}
