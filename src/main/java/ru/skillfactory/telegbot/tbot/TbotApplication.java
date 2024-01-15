package ru.skillfactory.telegbot.tbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class TbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbotApplication.class, args);
	}

}
