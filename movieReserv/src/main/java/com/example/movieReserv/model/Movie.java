package com.example.movieReserv.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "movies")
public class Movie {


    @Id
    @GeneratedValue // automatic generation of id's
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT") // make this a TEXT data type (not limited to 255 chars)
    private String description;

    @Column(nullable = false)
    private Integer duration;

    @Column
    private String genre;

    @Column
    private LocalDate releaseDate;

    public Movie() {
    }

    public Movie(Long id, String title, String description, Integer duration, String genre, LocalDate releaseDate, Integer places) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
