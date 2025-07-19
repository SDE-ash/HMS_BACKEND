package com.hospital.management.hms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.management.hms.dtos.PatientDTO;
import com.hospital.management.hms.services.PatientService;

@RestController
@RequestMapping("/hms/pat")
public class PatientCntrl {

    @Autowired
    private PatientService patientService;

    @PostMapping("/new-p-record")
    public ResponseEntity<?> savePatientRecord(@RequestBody PatientDTO patientDTO){
        return patientService.savePatient(patientDTO);
    }

}
