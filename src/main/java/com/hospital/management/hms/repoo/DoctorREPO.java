package com.hospital.management.hms.repoo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.hms.modal.Doctors;


@Repository
public interface DoctorREPO extends JpaRepository<Doctors, Long> {

    Optional<Doctors> findBydId(Long id);

    Optional<Doctors> findByNameAndSpeciality(String name, String speciality);

}
