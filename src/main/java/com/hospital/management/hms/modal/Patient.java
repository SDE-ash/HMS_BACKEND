package com.hospital.management.hms.modal;

import com.hospital.management.hms.enums.Gender;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Email(message = "email is required")
    @NotBlank(message = "email cannot be empty")
    private String email;

    @NotBlank(message = "name cannot be blank")
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender genders;

    @NotNull(message = "patient age is required")
    private int age;

    @OneToOne(mappedBy = "patient")
    private Bill bill;


}
