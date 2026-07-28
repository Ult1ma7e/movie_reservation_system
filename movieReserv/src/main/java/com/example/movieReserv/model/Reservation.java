package com.example.movieReserv.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screening_id", nullable = false)
    private Screening screening;

    @Column(name = "seats_count", nullable = false)
    private Integer seatsCount;

    @CreationTimestamp
    @Column(name = "reserved_at", nullable = false, updatable = false)
    private LocalDateTime reservedAt;

    public Reservation() {}

    public Reservation(User user, Screening screening, Integer seatsCount) {
        this.user = user;
        this.screening = screening;
        this.seatsCount = seatsCount;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Screening getScreening() { return screening; }
    public void setScreening(Screening screening) { this.screening = screening; }

    public Integer getSeatsCount() { return seatsCount; }
    public void setSeatsCount(Integer seatsCount) { this.seatsCount = seatsCount; }

    public LocalDateTime getReservedAt() { return reservedAt; }
}
