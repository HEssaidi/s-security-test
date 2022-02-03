package com.example.googleoauthtest.resource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/api/v1/hello")
public class TestResource {

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseStatus(OK)
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }
}
