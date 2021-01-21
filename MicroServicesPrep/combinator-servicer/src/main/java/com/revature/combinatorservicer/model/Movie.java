package com.revature.combinatorservicer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int movieId;

    private String movieName;

    private String description;
}
