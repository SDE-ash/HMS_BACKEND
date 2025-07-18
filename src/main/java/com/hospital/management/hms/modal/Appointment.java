package com.hospital.management.hms.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
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
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aptId;

    private String disOrder;

    @OneToOne
    @JoinColumn(name = "pId")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "dId")
    private Doctors doctor;

    @OneToOne
    @JoinColumn(name = "billiD")
    private Bill BILL;

}
