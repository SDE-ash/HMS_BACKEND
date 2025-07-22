package com.hospital.management.hms.exceptions;

public class BillNotFoundException extends RuntimeException {


    public BillNotFoundException(String message){
        super(message);
    }
}
