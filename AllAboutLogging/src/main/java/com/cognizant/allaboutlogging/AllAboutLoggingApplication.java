package com.cognizant.allaboutlogging;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class AllAboutLoggingApplication {

//	private static Logger log = LoggerFactory.getLogger(AllAboutLoggingApplication.class);
	private static Logger log = LoggerFactory.getLogger("Priyanshi");
	
	private static void sayHi() {
		log.info("Started");
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AllAboutLoggingApplication.class, args);
		
		
		Environment environment = ctx.getEnvironment();
		System.out.println(environment.getProperty("logging.pattern.file"));
		
//		System.out.println(log.getName());
		
		log.debug("Debug Statement");	
		log.error("Error log statement");
		log.warn("Warn log statement");
		log.info("info log statement");
		log.trace("trace log statement");
		
		sayHi();
		
		SecondClass.methodOfSecondClass();
	
	
	
	}

}
