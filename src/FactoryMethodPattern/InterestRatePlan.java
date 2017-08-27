package FactoryMethodPattern;

abstract class InterestRatePlan {

	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units){
		System.out.println("Calculate Bill Method called :- "+(units*rate));
		
	}
	
}
