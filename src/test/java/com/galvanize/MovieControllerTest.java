package com.galvanize;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerTest {

    @Autowired
    MockMvc mvc;

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

        MockHttpServletRequestBuilder request = post("/api/movies")
                .content("{}").contentType(MediaType.APPLICATION_JSON);

        //Setup
        mvc.perform(request).andExpect(status().isOk())
                .andExpect(jsonPath("$.id").exists());
    }
}
