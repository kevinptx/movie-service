package com.galvanize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    MovieRepository repository;

    @GetMapping("/api/movies")
    public String getAllMovies(){
        return "Hello";
    }
    @PostMapping("/api/movies")
    public Movie createMovie(@RequestBody Movie movie){
        Movie newMovie = repository.save(movie);
        return newMovie;
    }

}
