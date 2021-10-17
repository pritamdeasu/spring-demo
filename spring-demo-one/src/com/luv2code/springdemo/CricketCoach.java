package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	private String emailString;
	private String teamString;
	
	public void setEmailString(String emailString) {
		System.out.println("Email setting");
		this.emailString = emailString;
	}

	public void setTeamString(String teamString) {
		System.out.println("Team name setting");
		this.teamString = teamString;
	}

	public String getEmailString() {
		return emailString;
	}

	public String getTeamString() {
		return teamString;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Cricket Coach";
	}

	@Override
	public String getDailyFortune() {
		
		return "This is Cricket Coach " +fortuneService.getFortune();
	}
	
	
	public CricketCoach() {
		System.out.println("Inside Cricket Coach Class's constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket's coach's setFortuneService");
		this.fortuneService = fortuneService;
	}
	

}
