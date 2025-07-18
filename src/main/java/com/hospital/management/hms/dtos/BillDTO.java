package com.hospital.management.hms.dtos;

import java.time.LocalDateTime;

import com.hospital.management.hms.enums.BILLSTATUS;
import com.hospital.management.hms.modal.Patient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillDTO {


    private Long bilId;

    private LocalDateTime dateTime;

    private BILLSTATUS billStatus;

    private Patient patient;

}
