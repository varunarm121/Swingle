package com.platora.swingleService.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MasterUserRequest {

    @JsonProperty("id")
    private String id;

    @JsonProperty("username")
    private String username;

    @JsonProperty("pwd")
    private String pwd;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("isUserVerified")
    private Boolean isUserVerified;

    @JsonProperty("userBio")
    private String userBio;

    @JsonProperty("userLookingFor")
    private String userLookingFor;

    @JsonProperty("media")
    private String media;

}
