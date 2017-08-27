import java.util.Arrays;


public class CasttingExample {
	 

	public static void main(String args[]) 
	{   
		System.out.println("Casting Example");
		
		Integer obj = new Integer(10);
		
		
		
		byte b = obj.byteValue();
		//System.out.println("Integer Object cast to byte value : "+b );
		
		
		short sh = obj.shortValue();
		//System.out.println("Integer Object cast to short value : "+sh );
		
		int i = obj.intValue();
		
		//System.out.println("Integer Object cast to int value : "+i );
		
		
		int k = 5;
		
		Integer obk = new Integer(k);
		
		//System.out.println("Casting Integer to int "+ obk);
		
		
		Integer j = new Integer(15);
		
		int p = 9;
		
		
		String s;
				
		
		s = j.toString();
		
		s= Integer.toString(p);
		
		
		//System.out.println("Casting Integer to int "+ s);
		
		j = j.valueOf(s);
		
		//System.out.println("Casting Integer to int "+ j);
		
		int[] aint =  {1,2,3};
		
		String str ;
		
		//System.out.println("String Array :  "+aint.toString().length());
		
		/*String[] arrayStr = {"test,test1,test2"};
		
		int [] arrayInt = new int[arrayStr.length];
		
		for (k = 0 ; k<arrayStr.length ; k++){
			try{
			arrayInt[k] = Integer.parseInt(arrayStr[k]);
		System.out.println("int Arrdsfgfdsgay :  ");
		}catch(NumberFormatException nfe){
			
		};
		}*/
		
	
		String str1 = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]";
		int[] arr = Arrays.stream(str1.substring(1, str1.length()-1).split(","))
		    .map(String::trim).mapToInt(Integer::parseInt).toArray();
		System.out.println("sadfdsaf: "+Arrays.toString(arr));
		
		//int [] v = Stream.of(line.split(",\\s+")).mapToInt(Integer::parseInt).toArray();
		
		
		
		double d = 2.30;
		
		double g;
		int a =5;
		
		g = a;
		System.out.println(a);
		
		int m;
		
		m = (int) d;
		
		System.out.println(m);
		
		
		
		
		
				
		
		
	}
}
