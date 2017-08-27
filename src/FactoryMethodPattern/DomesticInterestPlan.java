package FactoryMethodPattern;

public class DomesticInterestPlan extends InterestRatePlan{
	
	public void getRate(){
		System.out.print("Get Rate Method called from DomesticInterestPlan class");
		rate = 3.50;
	}

}
