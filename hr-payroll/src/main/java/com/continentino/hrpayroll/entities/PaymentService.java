package com.continentino.hrpayroll.entities;

import org.springframework.stereotype.Service;

//@Component
@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
     return new Payment("Bob", 200.0, days);
    }

}
