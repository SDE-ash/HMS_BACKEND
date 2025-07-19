package com.hospital.management.hms.dtos;

import com.hospital.management.hms.enums.Gender;
import com.hospital.management.hms.modal.Bill;

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
public class PatientDTO {

     private Long id;

    private String name;

    private Gender genders;

    private int age;

    private Bill bill;

    private String email;

}
