package com.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepository {
public void save() {
	System.out.println("record has been saved in database");
}
}
