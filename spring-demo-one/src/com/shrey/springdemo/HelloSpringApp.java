package com.shrey.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Coach theContext = context.getBean("myCoach",Coach.class);
        System.out.println(theContext.getDailyWorkout());
        System.out.println(theContext.getDailyFortune());
        context.close();
	}

}
