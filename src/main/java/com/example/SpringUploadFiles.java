package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import java.io.File;

@SpringBootApplication
public class SpringUploadFiles {

	public static String ROOT = "upload";

	public static void main(String[] args) {
		SpringApplication.run(SpringUploadFiles.class, args);
	}

	@Bean(name = "multipartResolver")
	public StandardServletMultipartResolver resolver() {
		return new StandardServletMultipartResolver();
	}
}
