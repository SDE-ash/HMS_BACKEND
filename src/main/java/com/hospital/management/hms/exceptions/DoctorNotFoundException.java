package com.hospital.management.hms.exceptions;

public class DoctorNotFoundException extends RuntimeException {

    public DoctorNotFoundException(String message){
        super(message);
    }
}
