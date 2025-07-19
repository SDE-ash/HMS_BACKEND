package com.hospital.management.hms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospital.management.hms.dtos.PatientDTO;
import com.hospital.management.hms.modal.Patient;
import com.hospital.management.hms.repoo.PatientRepo;

@Service
public class PatientService {

    @Autowired
    private PatientRepo  patientRepo;

    //save patient

    public ResponseEntity<?> savePatient(PatientDTO patientDTO){

        Optional<Patient> pOPt =  patientRepo.findByEmail(patientDTO.getEmail());
        if(pOPt.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        //map patient dto to patient;
        patientRepo.save(Patient.builder()
        .id(patientDTO.getId())
        .name(patientDTO.getName())
        .age(patientDTO.getAge())
        .email(patientDTO.getEmail())
        .genders(patientDTO.getGenders())
        .build());

        return new ResponseEntity<>("SAVED SUCCESSFULLY!", HttpStatus.OK);
    }

}
