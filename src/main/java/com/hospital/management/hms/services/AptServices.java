package com.hospital.management.hms.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospital.management.hms.dtos.AppointmentDTO;
import com.hospital.management.hms.modal.Appointment;
import com.hospital.management.hms.repoo.AptRepo;

@Service
public class AptServices {

    @Autowired
    private AptRepo aptRepo;


    public ResponseEntity<?> createAppointment(AppointmentDTO appointmentDTO){
        
        try{
            
                aptRepo.save(Appointment.builder()
                .aptDate(LocalDateTime.now())
                .disOrder("cancer")
                .patient(appointmentDTO.getPatient())
                .bill(appointmentDTO.getBILL())
                .doctor(appointmentDTO.getDoctor())
                .build());
            return new ResponseEntity<String>("NEW APPOINTMENT ADDED", HttpStatus.OK);
        }catch(RuntimeException r){
           return new ResponseEntity<RuntimeException>(r, HttpStatus.BAD_REQUEST);
        }
    }


    public ResponseEntity<?> getAllApt() {
        List<Appointment> l  = aptRepo.findAll();
        return new ResponseEntity<List<Appointment>>(l, HttpStatus.OK);
    }

}
