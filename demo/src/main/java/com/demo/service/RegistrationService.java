package com.demo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.demo.repository.RegistrationRepository;

import jakarta.annotation.Resource;
@Scope("singleton")
@Service
public class RegistrationService {
	private static final Logger LOG=LoggerFactory.getLogger(RegistrationService.class);
	@Autowired
	private RegistrationRepository repository;
	@Autowired
	private RegistrationRepository repository1;
//	@Qualifier("twinkleRepository")
//	@Autowired
	@Resource(name="twinkleRepository")
	private MyService service;
	public void doRegistration() {
		//System.out.println("do registration method started");
		service.test();
		LOG.info("do registration method started");
		LOG.info("repository {} repository1 {}",repository.hashCode(),repository1.hashCode());
		System.out.println(repository.hashCode());
		System.out.println(repository1.hashCode());
		repository.save();
	}
}
