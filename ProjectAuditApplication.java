package com.example.projectaudit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application boot class.
 */
@ComponentScan("com.example.projectaudit.core")
@SpringBootApplication
public class ProjectAuditApplication {

	/**
	 * Main function.
	 *
	 * @param args arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProjectAuditApplication.class, args);
	}

}

