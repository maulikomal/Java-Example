package FactoryMethodPattern;

public class CommercialInterestPlan extends InterestRatePlan{
	
	public void getRate(){
		System.out.print("Get Rate Method called from CommercialInterestPlan class");
		rate = 5.50;
	}

}
