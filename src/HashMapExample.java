import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
	
	public static void main (String arg[]){
		
		// HashMap Example: HashMap maintains no order but TreeMap maintains ascending order.
		// HashMap can contain one null key and multiple null values.
		// HashMap is not synchronized.
		// Fast
		//Fail fast iterator

		System.out.println("HashMap Example :");
		HashMap hm = new HashMap();
		
		hm.put("one", new Integer((1)));
		hm.put("two", new Integer((2)));
		hm.put("three", new Integer((3)));
		hm.put("four", new Integer((4)));
		hm.put(null, new Integer((0)));
		
		Set set = hm.entrySet();
		Iterator ite = set.iterator();
		
		while (ite.hasNext()){
			Map.Entry me = (Map.Entry)ite.next();
			System.out.print("HashMap Keys : " +me.getKey()+" & ");
			System.out.println("Value : "+me.getValue());
			
		}

		// TreeMap Example: HashMap maintains no order but TreeMap maintains ascending order.

		System.out.println("TreeMap Example :");
		
		TreeMap tm = new TreeMap();
		
		tm.put("one", new Integer((1)));
		tm.put("two", new Integer((2)));
		tm.put("three", new Integer((3)));
		tm.put("four", new Integer((4)));
		
		
		Set set1 = tm.entrySet();
		Iterator ite1 = set1.iterator();
		
		while (ite1.hasNext()){
			Map.Entry mea = (Map.Entry)ite1.next();
			System.out.print("TreeMap Keys : " +mea.getKey()+" & ");
			System.out.println("Value : "+mea.getValue());
			
		}
				
		
		// HashTable Example: Hashtable cannot contain any null key or null value.
		// Hashtable is synchronized.

				System.out.println("Hashtable Example :");
				
				Hashtable htb = new Hashtable();
				
				
				
				htb.put("one", new Integer((1)));
				htb.put("two", new Integer((2)));
				htb.put("three", new Integer((3)));
				htb.put("four", new Integer((4)));
				//htb.put(null, new Integer((5)));
				
				// if u open comment u get error because Hashtable cannot contain any null key or null value
				
				
				Set set2 = htb.entrySet();
				Iterator ite2 = set2.iterator();
				
				while (ite2.hasNext()){
					Map.Entry meat = (Map.Entry)ite2.next();
					System.out.print("Hashtable Keys : " +meat.getKey()+" & ");
					System.out.println("Value : "+meat.getValue());
					
				}
		
	}

}
