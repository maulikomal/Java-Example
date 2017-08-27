package Java8Features;

import java.util.Arrays;
import java.util.List;

public class MultiLineLambda {

	public static void main(String[] args) {

		List<Integer> lt = Arrays.asList(1,2,3,4,5);
		
		lt.forEach((Integer i)->{
			System.out.println(""+i);
		});
	}

}
