package com.platora.swingleService.api.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class APIResponse<T> extends ResponseEntity<T> {

    public APIResponse(T payload, HttpStatus status) {
        super(payload, status);
    }

    public static <T> APIResponse<T> success(T payload) {
        APIResponse<T> response = new APIResponse<T>(payload, HttpStatus.OK);
        return response;
    }

    public static <T> APIResponse<T> created(T payload) {
        APIResponse<T> response = new APIResponse<T>(payload, HttpStatus.CREATED);
        return response;
    }

    public static <T> APIResponse<T> error(T payload) {
        APIResponse<T> response = new APIResponse<T>(payload, HttpStatus.INTERNAL_SERVER_ERROR);
        return response;
    }

    public static <T> APIResponse<T> badRequest(T payload) {
        APIResponse<T> response = new APIResponse<T>(payload, HttpStatus.BAD_REQUEST);
        return response;
    }

    public static <T> APIResponse<T> noContent(T payload) {
        APIResponse<T> response = new APIResponse<T>(payload, HttpStatus.NO_CONTENT);
        return response;
    }


}
