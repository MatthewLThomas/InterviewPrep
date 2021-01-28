package com.revature.userratingsservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.apache.catalina.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Builder
public class Movies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore

    private Integer movieRatingId;

    @OneToOne(targetEntity = UserRatings.class)
    String string;
    private Integer movieId;


    private Integer rating;

}
