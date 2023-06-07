package com.cognizant.allaboutlogging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecondClass {

	public static void methodOfSecondClass() {
		
		log.warn("Warn from second class");
		log.info("Info from second class");
		log.trace("Trace from second class");
		
	}
}
