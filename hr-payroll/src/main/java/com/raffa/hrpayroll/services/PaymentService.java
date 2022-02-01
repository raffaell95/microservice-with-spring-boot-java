package com.raffa.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raffa.hrpayroll.entities.Payment;
import com.raffa.hrpayroll.entities.Worker;
import com.raffa.hrpayroll.feignclients.WorkerFeignCLient;

@Service
public class PaymentService { 
	
	@Autowired
	private WorkerFeignCLient workerFeignClient; 
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
