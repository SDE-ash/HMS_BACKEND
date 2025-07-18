package com.hospital.management.hms.dtos;

import com.hospital.management.hms.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class DoctorDTO {

    private Long dId;

    private String name;

    private int age;

    private int experince;

    private Gender gender;

    private String speciality;

}
