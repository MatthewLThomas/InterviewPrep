package com.revature.combinatorservicer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movies {
    @Id
    @GeneratedValue
    private int movieId;

    private int rating;

    @ManyToMany(mappedBy = "moviesList")
    private List<UserRatings> moviesList;
}
