package com.TPOO.TP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class Tp1Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-config.xml");

		SpringApplication.run(Tp1Application.class, args);

		Service zooService=(Service) context.getBean("ZooService");
		try {
			zooService.nouveauVisiteur();
		}catch(LimiteVisiteurException e){ System.out.println("Trop de visiteurs");}



	}


}
