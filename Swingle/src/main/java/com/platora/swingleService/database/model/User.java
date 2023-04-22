package com.platora.swingleService.database.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    private String id;

    private String username;

    private String pwd;

    private String phone;

    private String email;

    private Boolean isUserVerified;

    private String userBio;

    private String userLookingFor;

    private String media;

    private Date createdAt;

    private Date updatedAt;

}
