package com.demo;

import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.demo.bean.Dog;
import com.demo.config.AppConfig;
import com.demo.ioc.C;
import com.demo.ioc.Student;
import com.demo.service.RegistrationService;
import com.twinkle.Cat;
//@SpringBootApplication=@SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan
@SpringBootApplication
@ComponentScan(basePackages = {"com.demo","com.twinkle"})
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Student student = context.getBean(Student.class);
//		student.setName("Kartik");
//		student.setCollege("SIRT");
//		student.setAddress("Bhopal");
//		student.setRollNumber(2);
//		System.out.println(student);
//		RegistrationService service = context.getBean(RegistrationService.class);
//		service.doRegistration();
//		RegistrationService service1 = context.getBean(RegistrationService.class);
//		System.out.println(service.hashCode());
//		System.out.println(service1.hashCode());
//		C c = context.getBean(C.class);
	//	c.m3(); 
//		
		Dog cat = context.getBean(Dog.class);
	//	Dog cat1 = context.getBean(Dog.class);
	//	System.out.println(cat.hashCode()+" "+cat1.hashCode());
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
//		AppConfig config = context.getBean(AppConfig.class);
//		Dog dog = config.getDogBean();
//		System.out.println(dog.getName()+" "+dog.getAge());
//		Properties dbInfo = config.getDbInfoBean();
//		System.out.println(dbInfo.get("database.driver"));
//		System.out.println(dbInfo.get("database.user"));
//		System.out.println(dbInfo.get("database.password"));
	}

}
