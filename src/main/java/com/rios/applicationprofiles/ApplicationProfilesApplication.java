package com.rios.applicationprofiles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class ApplicationProfilesApplication {

	@Value("${profile}")
	private String profile;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationProfilesApplication.class, args);
	}

	@PostConstruct
	public void logProfile() {
		log.info("Profile: " + profile);
	}

}
