package com.vishal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week1Application.class, args);
	}


	private CakeBaker cakeBaker;

	Week1Application(CakeBaker cakeBaker)
	{
		this.cakeBaker = cakeBaker;
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
