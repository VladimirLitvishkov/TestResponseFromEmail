package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import test.service.EmailTestService;

@RestController
@CrossOrigin("*")
public class EmailTestController {
	
	@Autowired
	EmailTestService service;
	
	@GetMapping("/send")
	public void sendEmail() {
		service.sendEmail();
	}
	
	@GetMapping("/response/{emailId}")
	public byte[] emailFromResponse(@PathVariable Integer emailId) {
		return service.responseFromEmail(emailId);
	}

}
