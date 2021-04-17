package com.example.demo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("cinema super hit");
		System.out.println("hi from team lead!");
		System.out.println("bye from team lead");
		
		
	}

}
