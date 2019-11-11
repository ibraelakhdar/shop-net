package com.eacompany.shopnetapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/hello")
public class InitEndpoint {


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(produces = "application/json",consumes = "application/json")
    public ResponseEntity<Response> getHello() {
        return new ResponseEntity<>(new Response("Hello you"), OK);
    }
}

@AllArgsConstructor
@Getter
@Setter
class Response {
    private String message;
}