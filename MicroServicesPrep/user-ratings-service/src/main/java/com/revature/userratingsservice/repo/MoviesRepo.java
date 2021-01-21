package com.revature.userratingsservice.repo;

import com.revature.userratingsservice.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface MoviesRepo extends JpaRepository<Movies, Integer> {



}
