package Java8Features;


interface test{
	int add(int a,int b);
	
}

class Demo{
	public void run(test t){
		System.out.println("Demo Class Called");
		int i = t.add(9,18);
		System.out.println("Return value is "+i);
	}
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lambda Expression Example");
		
		int c = 100;
		Demo  demo = new Demo();
		// with Lambda Expression we can avoid bellow code

		/*demo.run(new test() {
			@Override
			public int add() {
				// TODO Auto-generated method stub
				System.out.println("add called");
				return 7;
			}
		});*/
		
		demo.run((a,b)->{ 
			return a+b+c;
		});
	}
}
