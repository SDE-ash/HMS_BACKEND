package com.hospital.management.hms.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hms-hc")
public class HealthCheck {


    @GetMapping
    public ResponseEntity<?> getHealthCheck(){
        return new ResponseEntity<>("SEEMS GOOD!",HttpStatus.OK);
    }

}
