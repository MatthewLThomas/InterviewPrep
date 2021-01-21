package com.revature.userratingsservice.repo;

import com.revature.userratingsservice.model.UserRatings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRatingsRepo extends JpaRepository<UserRatings, Integer> {

    UserRatings findByUserName(String userName);
}
