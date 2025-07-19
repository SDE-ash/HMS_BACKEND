package com.hospital.management.hms.repoo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.hms.modal.Bill;


@Repository
public interface BillREPO extends JpaRepository<Bill, Long> {

}
