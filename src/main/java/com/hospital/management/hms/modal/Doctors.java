package com.hospital.management.hms.modal;

import com.hospital.management.hms.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
@Entity
public class Doctors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dId;

    @NotBlank(message = "respective Doctor Name is required")
    private String name;

    @NotNull(message = "age is required")
    private int age;

    @NotNull(message = "experience mu be written")
    private int experince;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotBlank(message = "speciality is required")
    private String speciality;

}
