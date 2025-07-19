package com.hospital.management.hms.repoo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.hms.modal.Appointment;
import java.time.LocalDateTime;


@Repository
public interface AptRepo extends JpaRepository<Appointment, Long> {

    Optional<Appointment> findByAptDate(LocalDateTime aptDate);

    Optional<Appointment> findByAptId(Long id);

}
