package net.jun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySlippApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySlippApplication.class, args); 
		
		// this is comment
		if ("asdfasdf".equals("asdfasdf")) {
			System.out.println("good");
		}
	}
}