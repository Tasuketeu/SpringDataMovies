package com.company.base.accenture.movies.ObjModelClass;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity(name = "Review")
@Table(name = "tb_reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "movie")
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name="review")
    private String review;
    @Column(name="rating")
    private String rating;
    @Column(name="login")
    private String login;
    @Column(name="imdb")
    private String imdb;
    @Column(name="date")
    private LocalDate date;
    @Transient
    private String reviewInfo;

//    @ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
//    @JoinColumn(name="imdb")
//    private Movie movie;

    public Review(String review, String rating, String login, LocalDate date,String imdb) {
        this.review = review;
        this.rating = rating;
        this.login = login;
        this.date = date;
        this.imdb = imdb;
    }

    public Review() { }

    public String getReviewInfo() {
        reviewInfo = String.format("%s %s %s %s %s", this.review, this.rating, this.login,
                this.date,this.imdb);
        return reviewInfo;
    }
}
