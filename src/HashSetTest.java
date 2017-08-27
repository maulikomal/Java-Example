
/**
 * @author mdavawal
 *A HashSet is simply a set that doesn't allow duplicate elements and doesn't order or position its elements.
 */
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet Example :  Set contains only unique elements.
		      System.out.println( "HashSet Example" );
		      // Create a collection
		      HashSet collection = new HashSet();
		      // Adding
		      String dog1 = "Max", dog2 = "Bailey", dog3 = "Harriet",dog4 = "Bailey",dog5 = "Harriet";
		      collection.add( dog1 );
		      collection.add( dog2 );
		      collection.add( dog3 );
		      collection.add( dog4 );
		      collection.add( dog5 );
		      // Sizing
		      System.out.println( "Collection created" +  ", size=" + collection.size() + ", isEmpty=" + collection.isEmpty() );
		      // Containment
		      System.out.println( "Collection contains value in dog1 " + dog1 + ": " + collection.contains( dog1 ) );
		      System.out.println( "Collection contains value in dog2 " + dog2 + ": " + collection.contains( dog2 ) );
		      System.out.println( "Collection contains value in dog3 " + dog3 + ": " + collection.contains( dog3 ) );
		      System.out.println( "Collection contains value in dog4 " + dog4 + ": " + collection.contains( dog4 ) );
		      System.out.println( "Collection contains value in dog5 " + dog5 + ": " + collection.contains( dog5 ) );
		      // Iteration. Iterator supports hasNext, next, remove
		      System.out.println( "Collection iteration (unsorted):" );
		      
		      System.out.println( "Iterator Example:" );
		      		      
		      Iterator iterator = collection.iterator();
		      while ( iterator.hasNext() ) 
		         System.out.println( "iterator Values :   " + iterator.next() );
		      // Removing
		      collection.remove( dog1 );
		     collection.clear();
		  // TreeSet Example :  TreeSet maintains ascending order and unique elements.
		     
		     System.out.println( "TreeSet Example" );
		      TreeSet collectionTree = new TreeSet();
		      
		      String dog11 = "one", dog22 = "two", dog33 = "two",dog44 = "four",dog55 = "five";
		      collectionTree.add( dog11 );
		      collectionTree.add( dog22 );
		      collectionTree.add( dog33 );
		      collectionTree.add( dog44 );
		      collectionTree.add( dog55 );
		      
		      System.out.println( "Collection created" +  ", size=" + collectionTree.size() + ", isEmpty=" + collectionTree.isEmpty() );
		      // Containment
		      System.out.println( "Collection contains value in dog1 " + dog11 + ": " + collectionTree.contains( dog11 ) );
		      System.out.println( "Collection contains value in dog2 " + dog22 + ": " + collectionTree.contains( dog22 ) );
		      System.out.println( "Collection contains value in dog3 " + dog33 + ": " + collectionTree.contains( dog33 ) );
		      System.out.println( "Collection contains value in dog4 " + dog44 + ": " + collectionTree.contains( dog44 ) );
		      System.out.println( "Collection contains value in dog4 " + dog55 + ": " + collectionTree.contains( dog55 ) );
		      
		      Iterator iterator2 = collectionTree.iterator();
		      while (iterator2.hasNext())
		      {
		    	  System.out.println("iterator2 Values :"+iterator2.next());
		    	  
		      }
		      
		      
		   // List Example : List can contain duplicate elements
			     
			     System.out.println("List Example");
			     
			     List lst = new ArrayList();
			     String list1 = "Max", list2 = "Max", list3  = "Harriet",list4  = "Bailey",list5  = "Harriet";
			     
			     lst.add(list1);
			     lst.add(list2);
			     lst.add(list3);
			     lst.add(list4);
			     lst.add(list5);
			     
			     System.out.println("List Printing"+lst);
			     
			     System.out.println( "Collection contains value in list1 " + list1 + ": " + collection.contains( list1 ) );
			      System.out.println( "Collection contains value in list2 " + list2 + ": " + collection.contains( list2 ) );
			      System.out.println( "Collection contains value in list3 " + list3 + ": " + collection.contains( list3 ) );
			      System.out.println( "Collection contains value in list4 " + list4 + ": " + collection.contains( list4 ) );
			      System.out.println( "Collection contains value in list5 " + list5 + ": " + collection.contains( list5) );
			      
			      Iterator iterator3 =  lst.iterator();
			      while(iterator3.hasNext())
			      {
			    	  System.out.println( "iterator3 Values :   " + iterator3.next() );
			      }   

	}

}
