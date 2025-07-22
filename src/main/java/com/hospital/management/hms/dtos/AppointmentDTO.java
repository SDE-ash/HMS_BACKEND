package com.hospital.management.hms.dtos;

import java.time.LocalDateTime;
import com.hospital.management.hms.modal.Bill;
import com.hospital.management.hms.modal.Doctors;
import com.hospital.management.hms.modal.Patient;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank(message = "disorder cannot be empty")
    private String disOrder;

    @NotNull(message = "patient cannot be empty")
    private Patient patient;

    @NotNull(message = "Doctors field cannot be empty")
    private Doctors doctor;

    private Bill BILL;

    private LocalDateTime aptDate;
}
