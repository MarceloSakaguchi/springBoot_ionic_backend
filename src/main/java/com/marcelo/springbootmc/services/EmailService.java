package com.marcelo.springbootmc.services;

import org.springframework.mail.SimpleMailMessage;

import com.marcelo.springbootmc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail (Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
