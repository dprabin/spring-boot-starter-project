package com.sts.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.sts.helloworld.controller.RootController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.sts.helloworld"})
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(new Object[]{App.class, RootController.class}, args);
	}
}
