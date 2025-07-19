package com.hospital.management.hms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.management.hms.dtos.DoctorDTO;
import com.hospital.management.hms.modal.Doctors;
import com.hospital.management.hms.repoo.DoctorREPO;

@Service
public class DoctorService {

    @Autowired
    private DoctorREPO doctorREPO;

    public void saveDoctorRecord(DoctorDTO doctorDTO){
        doctorREPO.save(Doctors.builder()
        .age(doctorDTO.getAge())
        .name(doctorDTO.getName())
        .experince(doctorDTO.getExperince())
        .speciality(doctorDTO.getSpeciality())
        .gender(doctorDTO.getGender())
        .build());
    }

}
