
public class ThreadExample extends Thread {

//}
//class ThreadExample extends Thread{  
public void run(){  
System.out.println("thread is running...");  

System.out.println("running thread name is:"+Thread.currentThread().getName());  
System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  

/*for(int i=1;i<=5;i++){  
    try{
    	Thread.sleep(500);
    	}catch(InterruptedException e)
    {
    		System.out.println(e);
    }  
    System.out.println(i);  
  }  */
}  
public static void main(String args[]){  
	ThreadExample threadExample =new ThreadExample();  
	Thread t1 =new Thread(threadExample);
	Thread t2 =new Thread(threadExample);
	Thread t3 =new Thread(threadExample);
	/*System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	  System.out.println("id of t1:"+t1.getId());  
	  System.out.println("id of t2:"+t2.getId());*/
	t1.start();
	// Thread Join Example :  
	/*try{  
		  t1.join();  
		 }catch(Exception e){System.out.println(e);}  */
	t2.start();
	t3.start();
	t1.setPriority(Thread.MIN_PRIORITY);  
	t2.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	
	/*t1.setName("Maulik Davawala");  
	  System.out.println("After changing name of t1:"+t1.getName());  */
	
 }  
}  