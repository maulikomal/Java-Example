import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;





public class Java8Tester {

	/*
	 *Lambda expression - Adds functional processing capability to JAVA.
	 *Method references - Referencing functions by their name instead of invoking them directly. Using functions as parameter.
	 *Default method - Interface to have default method implementation.
	 *New Tools - New compiler tools and utilities are added like jdeps to figure out the dependencies.
	 *Stream API - New stream API to facilitate pipeline processing.
	 *Date Time API - Improved date time api.
	 *Optional - Emphasis on best practices, to handle null values properly.
	 *Nashorn , JavaScript Engine - A JAVA based engine to execute JavaScript code.
	 */
	
	public static <String> void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> L1 = new ArrayList<String>();
		
		L1.add("Maulik");
		L1.add("Komal");
		L1.add("pratham");
		L1.add("ashvi");
		
		List <String> L2 = new ArrayList<String>();
		
		L2.add("Maulik");
		L2.add("Komal");
		L2.add("pratham");
		L2.add("ashvi");
				
		Java8Tester tester = new Java8Tester();
		System.out.println("Sorting yousing Java 7 Systax");
		
		System.out.println(L1);
		
		
		
	}
	
	private void sortUsingJava7(List <String> names){
		
		System.out.println("sortUsingJava7 Method Call");
		
		Collections.sort(names,new Comparator<String>() {
			
			public int compare(String s1,String s2){
				return s1.compareTo(s2);
			}
			
		});
		}
	
	/*private void sortUsingJava8(List <String> names){
		Collections.sort(names,(s1,s2)-> s1.compareTo(s2));*/
	}
	
		
		
		
		
	}

}
