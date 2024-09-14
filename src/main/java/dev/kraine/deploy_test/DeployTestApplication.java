package dev.kraine.deploy_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dev.kraine")
public class DeployTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployTestApplication.class, args);
	}

}
