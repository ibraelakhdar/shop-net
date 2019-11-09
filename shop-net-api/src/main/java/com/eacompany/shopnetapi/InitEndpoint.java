package com.eacompany.shopnetapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/hello")
public class InitEndpoint {


    @GetMapping(produces = "application/json")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<>("Hello you", OK);
    }
}
