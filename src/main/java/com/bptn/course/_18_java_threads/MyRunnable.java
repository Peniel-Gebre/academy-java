package com.bptn.course._18_java_threads;

//Step 1. Created a class that implements Runnable Interface
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("Interrupted exception has occured: " + e.getMessage());
				

			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//Step 2. Create an object of MyRunnable (class that implements the Runnable Interface)
		MyRunnable myObj = new MyRunnable();
		
		
		Thread thread = new Thread(myObj);
		
		thread.start();
		
		

	}
	
	

}


//Steps to create a thread using Runnable interface

//Step 1. Created a class that implements Runnable Interface
//Step 2. Create an object of MyRunnable (class that implements the Runnable Interface)
//Step 3. Create an object from the thread class and pass the object created in step 2 into the constructor
//Step 4. Start the thread using start()

//sleep() -> it's a static method
//Throws:
//IllegalArgumentException - if the value of millis is negative
//InterruptedException - if any thread has interrupted the current thread