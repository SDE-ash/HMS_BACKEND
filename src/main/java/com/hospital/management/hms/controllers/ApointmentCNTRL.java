package com.hospital.management.hms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.hms.dtos.AppointmentDTO;
import com.hospital.management.hms.services.AptServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hms")
@Validated
public class ApointmentCNTRL {

    @Autowired
    private AptServices aptServices;

    @PostMapping("/new-apt")
    public ResponseEntity<?> newAppointmentRecord(@Valid @RequestBody AppointmentDTO appointmentDTO){
        return aptServices.createAppointment(appointmentDTO);
    }


    @GetMapping("/all-apt")
    public ResponseEntity<?> getAllApointment(){
        return aptServices.getAllApt();
    }

    @GetMapping("/apt-id/{apt_id}")
    public ResponseEntity<?> getAptById(@PathVariable Long apt_id){
        return aptServices.findAptById(apt_id);
    }




}
