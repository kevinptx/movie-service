package com.galvanize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.galvanize.Movie;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie save(Movie movie){
        return movie;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
}
