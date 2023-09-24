package com.tek.ubs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UBSController {

    @GetMapping("/ubs")
    public ResponseEntity<String> getMsg() {

        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }
}
