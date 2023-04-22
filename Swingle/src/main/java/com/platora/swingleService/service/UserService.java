package com.platora.swingleService.service;

import com.platora.swingleService.api.request.MasterUserRequest;
import com.platora.swingleService.database.model.User;
import com.platora.swingleService.database.repo.UserRepo;
import com.platora.swingleService.helper.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User getUser(String userId){
        User user = userRepo.findById(userId).orElse(null);
        return user;
    }

    public User createUser(MasterUserRequest userRequest){
        User user = User.builder()
                .id(UUID.randomUUID().toString())
                .username(userRequest.getUsername())
                .pwd(userRequest.getPwd())
                .phone(userRequest.getPhone())
                .email(userRequest.getEmail())
                .isUserVerified(userRequest.getIsUserVerified())
                .userBio(userRequest.getUserBio())
                .userLookingFor(userRequest.getUserLookingFor())
                .media(userRequest.getMedia())
                .createdAt(new Date())
                .updatedAt(new Date())
                .build();

        return userRepo.save(user);
    }

    public User updateUser(MasterUserRequest userRequest){
        User newUserData = User.builder()
                .id(UUID.randomUUID().toString())
                .username(userRequest.getUsername())
                .pwd(userRequest.getPwd())
                .phone(userRequest.getPhone())
                .email(userRequest.getEmail())
                .isUserVerified(userRequest.getIsUserVerified())
                .userBio(userRequest.getUserBio())
                .userLookingFor(userRequest.getUserLookingFor())
                .media(userRequest.getMedia())
                .createdAt(new Date())
                .updatedAt(new Date())
                .build();
        User oldUserData = userRepo.findById(userRequest.getId()).orElse(null);
        Utility.copyNonNullProperties(newUserData, oldUserData);

        return userRepo.save(oldUserData);
    }
}
