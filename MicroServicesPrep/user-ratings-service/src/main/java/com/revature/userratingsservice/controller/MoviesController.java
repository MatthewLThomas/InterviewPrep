package com.revature.userratingsservice.controller;


import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import com.revature.userratingsservice.model.Movies;
import com.revature.userratingsservice.repo.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {
    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    MoviesRepo moviesRepo;

    @GetMapping("")
    List<Movies> findAll(){
        return moviesRepo.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Movies movies){
        moviesRepo.save(movies);
    }
}
