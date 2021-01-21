package com.revature.combinatorservicer.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRatings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "moviesList",
            joinColumns = {@JoinColumn(name = "userId")},
            inverseJoinColumns = {@JoinColumn(name = "movieID")}
    )
    private List<Movies> moviesList;


}
