package com.hospital.management.hms.exceptions;



import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PatientNotFoundException.class)
    public ResponseEntity<?> handlePatientNotFound(PatientNotFoundException p){
        return new ResponseEntity<String>(p.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BillNotFoundException.class)
    public ResponseEntity<?> handleBillNotFound(BillNotFoundException b){
        return new ResponseEntity<String>(b.getMessage(), HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(DoctorNotFoundException.class)
    public ResponseEntity<?> handleDoctorNotFound(DoctorNotFoundException d){
        return new ResponseEntity<String>(d.getMessage(), HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(AppointmentNotFoundException.class)
    public ResponseEntity<?> handleApptNotFound(AppointmentNotFoundException a){
        return new ResponseEntity<String>(a.getMessage(), HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException e){
        Map<String, String> m  = new HashMap<>();
        e.getBindingResult().getFieldErrors().forEach(ee-> m.put(ee.getField(), ee.getDefaultMessage()));
        return new ResponseEntity<Map<String, String>>(m,HttpStatus.BAD_REQUEST);
    }

    

}
