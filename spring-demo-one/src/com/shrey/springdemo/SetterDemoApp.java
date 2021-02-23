package com.shrey.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theContext = context.getBean("myCricketCoach",CricketCoach.class);
        System.out.println(theContext.getDailyWorkout());
        System.out.println(theContext.getDailyFortune());
        context.close();

	}

}
