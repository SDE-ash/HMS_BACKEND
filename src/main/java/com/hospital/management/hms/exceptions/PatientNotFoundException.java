package com.hospital.management.hms.exceptions;

public class PatientNotFoundException extends RuntimeException {


        public PatientNotFoundException(String message){
            super(message);
        }

}
