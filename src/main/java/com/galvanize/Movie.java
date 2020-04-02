package com.galvanize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {



    @Id
    @GeneratedValue
    Long id;
    String imdbId;
    String director;
    String title;
    String year;

    public Movie() {
    }

    public Movie(Long id, String imdbId, String director, String title, String year) {
        this.id = id;
        this.imdbId = imdbId;
        this.director = director;
        this.title = title;
        this.year = year;
    }

    public Movie(String imdbId, String director, String title, String year) {
        this.imdbId = imdbId;
        this.director = director;
        this.title = title;
        this.year = year;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
