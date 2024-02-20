package com.example.projectcontroller

import com.example.projectaudit.core.ProjectAuditAspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan(basePackages = "com.example") 
public class ProjectAuditConfiguration {
    @Bean
        public ProjectAuditAspect projectAuditAspect() {
            return new ProjectAuditAspect();
        }

}
