package FactoryMethodPattern;

public class GetPlanFactory {
	
	
    public InterestRatePlan getPlan(String planType){  
         if(planType == null){  
          return null;  
         }  
       if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
              return new DomesticInterestPlan();  
            }   
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
             return new CommercialInterestPlan();  
         }   
       
   return null;  
}  
	
}
