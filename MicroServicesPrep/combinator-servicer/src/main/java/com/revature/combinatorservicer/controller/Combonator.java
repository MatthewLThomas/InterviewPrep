package com.revature.combinatorservicer.controller;

import com.revature.combinatorservicer.model.Movie;
import com.revature.combinatorservicer.model.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/combonator")
public class Combonator {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("username/{username}"
    public  getUserRatingList(@PathVariable("username") String username ){
        restTemplate.getForObject("http://movie-catalog-service/movies" , Movie.class);


}
