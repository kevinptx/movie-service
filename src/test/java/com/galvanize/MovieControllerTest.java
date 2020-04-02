package com.galvanize;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerTest {

    @Autowired
    MockMvc mvc;
    @MockBean
    MovieService movieService;
    ObjectMapper mapper = new ObjectMapper();

    //first, @SpringBootTest, import MockMvc, must have AutoConfigureMockMvc,
    // import MockMvcRequestBuilders, and MockMvcResultMatchers.
    @Test
    void getAllMovies() throws Exception {
        //SEAT

        //Setup
        mvc.perform(get("/api/movies")).andExpect(status().isOk());
  //              .andExpect(jsonPath("$", hasSize(1)));
        //Exercise

        //Assert
    }


    @Test
    void createMovie() throws Exception {

        //Setup
        Movie movie = new Movie("tt3896198", "James Gunn", "Guardians of the Galaxy Vol. 2", "2017");
        String movieJson = mapper.writeValueAsString(movie);
        movie.setId(1L);
        when(movieService.save(ArgumentMatchers.any(Movie.class))).thenReturn(movie);
        mvc.perform(post("/api/movies")
                .contentType(MediaType.APPLICATION_JSON).content(movieJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").exists());
    }

    @Test
    void getMovieById() {
    }
}
