package com.revature.userratingsservice.controller;


import com.revature.userratingsservice.model.UserRatings;
import com.revature.userratingsservice.repo.UserRatingsRepo;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRatingsController {

    @Autowired
    UserRatingsRepo userRatingsRepo;

    @GetMapping("findAll")
    public List<UserRatings> findAll(){
        return userRatingsRepo.findAll();
    }

    @GetMapping("username/{username}")
    public UserRatings getUserRatings(@PathVariable("username") String username){
        System.out.print(username);
        return userRatingsRepo.findByUserName(username);
    }

    @PostMapping("/save")
    public void save(@RequestBody UserRatings userRatings){
        userRatingsRepo.save(userRatings);
    }

}
