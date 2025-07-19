package com.hospital.management.hms.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.hms.dtos.AppointmentDTO;
import com.hospital.management.hms.services.AptServices;

@RestController
@RequestMapping("/hms")
public class ApointmentCNTRL {

    @Autowired
    private AptServices aptServices;

    @PostMapping("/new-apt")
    public ResponseEntity<?> newAppointmentRecord(@RequestBody AppointmentDTO appointmentDTO){
        return aptServices.createAppointment(appointmentDTO);
    }


    @GetMapping("/all-apt")
    public ResponseEntity<?> getAllApointment(){
        return aptServices.getAllApt();
    }


}
