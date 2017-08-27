import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class demo {
	public static boolean is10Friendly(long num) {
	    List<Integer> numbers = new ArrayList<>();
	    Map<String, Integer> friendly = new HashMap<>();
	    
	    int count = 0;
	    while (num > 0) {
	        int cur = (int) (num % 10);
	        numbers.add(cur);
	        friendly.put(String.valueOf(cur) + "_" + String.valueOf(count++), 0);
	        num /= 10;
	    }

	    for (int i = 0; i < numbers.size(); i++) {
	        int counter = 0;
	        for (int j = i; j < numbers.size(); j++) {
	            counter += numbers.get(j);
	            if (counter == 10) {
	                for (int jj = i; jj <= j; jj++) {
	                    String key = String.valueOf(numbers.get(jj)) + "_" + String.valueOf(jj);
	                    Integer val = friendly.get(key);
	                    friendly.put(key, ++val);
	                }
	                break;
	            }
	            if (counter > 10) {
	                break;
	            }
	        }
	    }
	    for (Integer val : friendly.values()) {
	        if (val < 1) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {

	   System.out.println("test1 "+is10Friendly(3523014)); //true
	   System.out.println("test2 "+is10Friendly(28546)); //false
	}	
}
