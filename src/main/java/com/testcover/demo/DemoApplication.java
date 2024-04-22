package com.testcover.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static String someLogic(){
    return "Logic!";
  }

	public static void main(String[] args) {
		var s = someLogic();
    SpringApplication.run(DemoApplication.class, args);
	}

}
