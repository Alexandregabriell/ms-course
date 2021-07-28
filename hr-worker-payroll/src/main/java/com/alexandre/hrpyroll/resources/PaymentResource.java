package com.alexandre.hrpyroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandre.hrpyroll.entities.Payment;
import com.alexandre.hrpyroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

	@Autowired
	private PaymentService paymentService;
	
	@GetMapping(value = "/{workerid}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerid, @PathVariable Integer days) {
		Payment payment = paymentService.getPayment(workerid, days);
		return ResponseEntity.ok(payment);
	}
	
}
