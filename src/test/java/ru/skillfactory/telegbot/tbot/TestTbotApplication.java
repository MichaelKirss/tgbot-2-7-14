package ru.skillfactory.telegbot.tbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTbotApplication {

	public static void main(String[] args) {
		SpringApplication.from(TbotApplication::main).with(TestTbotApplication.class).run(args);
	}

}
