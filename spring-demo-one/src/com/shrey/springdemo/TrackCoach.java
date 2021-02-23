package com.shrey.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService; 
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it "+ fortuneService.getFortune();
	}

}
