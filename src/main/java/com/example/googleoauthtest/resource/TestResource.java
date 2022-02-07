package com.example.googleoauthtest.resource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/api/v1")
public class TestResource {

    @GetMapping("/hello")
    @ResponseStatus(OK)
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }
    @GetMapping("/helloUser")
    @ResponseStatus(OK)
    public ResponseEntity<String> sayHelloToUser() {
        return ResponseEntity.ok("Hello World by user");
    }
    @GetMapping("/helloAdmin")
    @ResponseStatus(OK)
    public ResponseEntity<String> sayHelloTOAdmin() {
        return ResponseEntity.ok("Hello World by admin");
    }
}
