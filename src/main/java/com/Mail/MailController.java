package com.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MailController {
	@Autowired
private	MailService mailService;
	
	@GetMapping("/send")
	public void sendmail() throws Exception {
		
		mailService.send();
		
		System.out.print("Messege Successfully Sent!");
		
		
	}
	
	
	
	
	

}
