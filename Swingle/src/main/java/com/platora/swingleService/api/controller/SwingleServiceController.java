package com.platora.swingleService.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SwingleServiceController {

    /**
     * Endpoint exposed for healthcheck/liveness/readiness probe.
     * @return A message with 200 OK response.
     */
    @GetMapping
    public String healthCheck() {
        return "Hello from New Main Service!!!!";
    }
}
