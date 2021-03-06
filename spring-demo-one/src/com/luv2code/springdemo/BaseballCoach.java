package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService	 = fortuneService; 
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
