package com.maildemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maildemo.model.MailStructure;
import com.maildemo.service.MailService;

@RestController
@RequestMapping("/mail")
public class MailController {
	@Autowired
	private MailService mailService;
	
	@PostMapping("/send/{mail}")
	public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure) {
		mailService.sendMail(mail, mailStructure);
		return "Successfully sent the mail !!";
	}
}
