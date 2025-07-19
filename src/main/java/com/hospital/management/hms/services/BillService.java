package com.hospital.management.hms.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.management.hms.dtos.BillDTO;
import com.hospital.management.hms.modal.Bill;
import com.hospital.management.hms.repoo.BillREPO;

@Service
public class BillService {

    @Autowired
    private BillREPO billREPO;

    public void saveBill(BillDTO billDTO){
        billREPO.save(Bill.builder().billStatus(billDTO.getBillStatus()).dateTime(LocalDateTime.now()).build());
    }

}
