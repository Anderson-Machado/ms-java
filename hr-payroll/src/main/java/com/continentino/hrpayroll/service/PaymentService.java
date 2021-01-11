package com.continentino.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import com.continentino.hrpayroll.entities.Payment;
import com.continentino.hrpayroll.entities.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Component
@Service
public class PaymentService {

   @Autowired
   private RestTemplate restTemplate;

   @Value("${hr-worker.host}")
   private String WorkHost;   

    public Payment getPayment(long workerId, int days) {
  
        Map<String,String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);
        Worker work = restTemplate.getForObject(WorkHost +"/workes/{id}", Worker.class, uriVariables);
        return new Payment(work.getName(), work.getDailylncome(), days);
    }

}
