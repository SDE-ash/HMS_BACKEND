package com.hospital.management.hms.services;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospital.management.hms.dtos.AppointmentDTO;
import com.hospital.management.hms.exceptions.AppointmentNotFoundException;
import com.hospital.management.hms.modal.Appointment;
import com.hospital.management.hms.modal.Bill;
import com.hospital.management.hms.modal.Patient;
import com.hospital.management.hms.repoo.AptRepo;

@Service
public class AptServices {

    @Autowired
    private AptRepo aptRepo;


    public ResponseEntity<?> createAppointment(AppointmentDTO appointmentDTO){
        try{
            Patient patient = appointmentDTO.getPatient();

            Bill bill = appointmentDTO.getBILL();
            bill.setPatient(patient);

            
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


    public ResponseEntity<?> findAptById(Long apt_id) {
        Appointment a = aptRepo.findByAptId(apt_id).orElseThrow(()-> new AppointmentNotFoundException("Appoinment not Recorded"));
        Map<String,Object> aMap = new LinkedHashMap<>();
                aMap.put("APPOINTMENT ID",a.getAptId());
                aMap.put("DISORDER", a.getDisOrder().toUpperCase());
                aMap.put("DATE OF BOOKING", a.getAptDate());
                aMap.put("DOCTOR NAME", "Dr."+a.getDoctor().getName().toUpperCase());
                aMap.put("PATIENT NAME", a.getPatient().getName().toUpperCase());
                aMap.put("BILL STATUS", a.getBill().getBillStatus());
                return new ResponseEntity<Map<String, Object>>(aMap,HttpStatus.OK);
    }
}


