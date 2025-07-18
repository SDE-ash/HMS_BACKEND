package com.hospital.management.hms.modal;

import java.time.LocalDateTime;

import com.hospital.management.hms.enums.BILLSTATUS;

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
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bilId;

    private LocalDateTime dateTime;

    private BILLSTATUS billStatus;

    @OneToOne
    @JoinColumn(name = "pId")
    private Patient patient;
}
