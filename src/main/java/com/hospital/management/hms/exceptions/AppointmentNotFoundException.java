package com.hospital.management.hms.exceptions;

public class AppointmentNotFoundException extends RuntimeException {

    public AppointmentNotFoundException(String message){
        super(message);
    }

}
