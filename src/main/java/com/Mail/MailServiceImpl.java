package com.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void send() throws Exception {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage , true);
		String subject = "This is a Testing Application!";
		String content= "Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do. The benefits of testing include preventing bugs, reducing development costs and improving performance. Test management plan. Types of software testing.";
		String to = "deepsaha01896@gmail.com";
		
		helper.setSubject(subject);
		helper.setFrom("DS-KART");
		helper.setTo(to);
		helper.setText(content);
		javaMailSender.send(mimeMessage);
		
	}
	
	

}
