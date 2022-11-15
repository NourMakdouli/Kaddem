package tn.esprit;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@EnableScheduling
@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {try {
		SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		}catch (Exception e) {
			log.error("error xampp or my life sucks  " );
			e.getStackTrace();
		}


}}
