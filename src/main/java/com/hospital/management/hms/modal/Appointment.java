package com.hospital.management.hms.modal;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Entity
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aptId;

    private String disOrder;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pId")
    private Patient patient;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dId")
    private Doctors doctor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billiD")
    private Bill bill;


    private LocalDateTime aptDate;

}
