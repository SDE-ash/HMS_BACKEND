package com.hospital.management.hms.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    

}
