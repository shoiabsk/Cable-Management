package com.cablemanagement.cable_management.service;

import com.cablemanagement.cable_management.entity.Customer;
import com.cablemanagement.cable_management.entity.Payment;

public interface PaymentService {
    Payment getPayment(Long id);

    Payment addPayment(Long id, Payment payment);

    // Payment updatePayment(Long id, Payment payment);

    void addHistory( Payment payment,Customer customer);
    
    String getDate();
    
}
