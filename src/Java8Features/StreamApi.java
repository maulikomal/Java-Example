package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
	
	/*List<String> items = new ArrayList<String>();

	items.add("one");
	items.add("two");
	items.add("three");

	Stream<String> streamFilter = items.stream();
	Stream<String> streamMap = items.stream();
	
	
	List<String> filtered = items.stream().filter( item -> item.startsWith("o")).collect(Collectors.toList());
	filtered.forEach(System.out::println);*/
	
	
	//streamFilter.filter(item -> item.startsWith("o")).forEach(System.out::println);
	
	//streamMap.map(item -> item.toUpperCase()).forEach(System.out::println);
	
	//List <Integer> items =  Arrays.asList(1,6,3,4,5);
	
	//items.forEach((Integer i)->{
		//System.out.println(""+i);
	//});
	
	// List of Integer Array sort Example
	
	//items.stream().sorted(Integer::compareTo).forEach(System.out::println);
	
	// List of Integer Array filter Example
	/*List<Integer> filtered = items.stream().filter( item -> item.equals(6)).collect(Collectors.toList());
	filtered.forEach(System.out::println);*/
	
		
		// Min example
	
	/*List<String> items = new ArrayList<String>();

	items.add("one");
	items.add("two");
	items.add("three");*/

	//Stream<String> stream = items.stream();

	/*String shortest = items.stream()
	        .min(Comparator.comparing(item -> item.length()))
	        .get();
	System.out.println(shortest);*/
	
	/*long count = items.stream()
		     .filter( item -> item.equals("two"))
		     .count();
	System.out.println(count);
*/
	
	
	List <Integer> items =  Arrays.asList(1,6,3,4,5);
	// List of Integer Array sort Example
	//items.stream().sorted(Integer::compareTo).forEach(System.out::println);

	// List of Integer Array filter Example
	/*List<Integer> filtered = items.stream().filter( item -> item.equals(6)).collect(Collectors.toList());
	filtered.forEach(System.out::println);*/
	
	
	/*Stream.of(1,2,4,5,6)
	.findFirst()
	.ifPresent(System.out::println);*/
		
	
	/*IntStream.range(1,4)
	.forEach(System.out::println);*/
		
		/*List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);
		*/
	
	Stream.of("a1", "a2", "a3")
    .map(s -> s.substring(1))
    .mapToInt(Integer::parseInt)
    .max()
    .ifPresent(System.out::println);
	
	
	}
}