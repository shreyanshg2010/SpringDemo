package com.shrey.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach : inside constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "spend 30 mins on cricket practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
