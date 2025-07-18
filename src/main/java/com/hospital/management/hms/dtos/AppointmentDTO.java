package com.hospital.management.hms.dtos;

import com.hospital.management.hms.modal.Bill;
import com.hospital.management.hms.modal.Doctors;
import com.hospital.management.hms.modal.Patient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AppointmentDTO {

    private long aptId;

    private String disOrder;

    private Patient patient;

    private Doctors doctor;

    private Bill BILL;
}
