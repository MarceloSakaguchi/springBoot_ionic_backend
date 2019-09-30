package com.marcelo.springbootmc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SmtpEmailService extends AbstractEmailService{

	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SmtpEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOGGER.info("Simulando envio de email");
		mailSender.send(msg);
		LOGGER.info("Email enviado");
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOGGER.info("Simulando envio de email");
		javaMailSender.send(msg);
		LOGGER.info("Email enviado");
		
	}

}
