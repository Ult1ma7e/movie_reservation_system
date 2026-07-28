package com.example.movieReserv.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "screening")
public class Screening {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false) // FK for Hall
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id", nullable = false) // FK for Movie
    private Hall cinemaHall;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "ticket_price", nullable = false)
    private Double ticketPrice;
}
