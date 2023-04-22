package com.platora.swingleService.api.controller;

import com.platora.swingleService.api.request.MasterUserRequest;
import com.platora.swingleService.api.response.APIResponse;
import com.platora.swingleService.database.model.User;
import com.platora.swingleService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1.0.0/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public APIResponse<Object> handleGetFilterById(@PathVariable String userId, @RequestHeader HttpHeaders headers) {
        log.info("Fetches the User Entity by User Id {}", userId);
        User userData = userService.getUser(userId);
        return APIResponse.success(userData);
    }

    /**
     * Master API to create or update user
     * @param userId
     * @param headers
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/userId")
    public APIResponse<Object> handleUserCreation(@PathVariable(required = false) String userId, @RequestBody MasterUserRequest userRequest, @RequestHeader HttpHeaders headers) {
        log.info("Fetches the User Entity by User Id {}", userId);
        User userData;
        if(userId.equals(null)){
            userData = userService.createUser(userRequest);
        } else {
            userData = userService.updateUser(userRequest);
        }
        return APIResponse.success(userData);
    }


}
