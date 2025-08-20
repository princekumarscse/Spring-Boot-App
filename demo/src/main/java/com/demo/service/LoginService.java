package com.demo.repository;

import org.springframework.stereotype.Service;

import com.demo.service.MyService;
//loginService,logoutService
@Service("twinkleRepository")
public class LoginService implements MyService{
	public void test() {
		System.out.println("loginRepository");
	}
}
