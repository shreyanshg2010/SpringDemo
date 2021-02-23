package com.shrey.springdemo;

public class BaseballCoach implements Coach{
 
	private FortuneService fortuneService; 
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public String getDailyWorkout(){
		return "spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
