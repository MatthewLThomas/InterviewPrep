package com.revature.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString

public class Movie {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int movieId;

    private String movieName;

    private String description;
}
