package FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPlanFactory planFactory = new GetPlanFactory();  
        
	      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String planName=br.readLine();  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
  	      int units=Integer.parseInt(br.readLine());  
	  
	      InterestRatePlan p = planFactory.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            
	}

}
