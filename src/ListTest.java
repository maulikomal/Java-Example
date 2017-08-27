import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListTest {

	public static void main(String[] args) {
		System.out.println("List Example");
		List<String> lst = new ArrayList<String>();
	      lst.add("alpha");
	      lst.add("beta");
	      lst.add("charlie");
	      System.out.println(lst);   // [alpha, beta, charlie]
	 
	      for (String str : lst) {
	         str += "change!";   // cannot modify "immutable" objects
	      }
	      System.out.println(lst);   // [alpha, beta, charlie]
	}

}
