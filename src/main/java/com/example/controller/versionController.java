package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class versionController {

    @GetMapping("/getVersion")
    public ResponseEntity<String> getVersion(){
        String version = "1.0";
        return new ResponseEntity<>(version, HttpStatus.OK);
    }
}
