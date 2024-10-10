package com.bptn.course._18_java_threads;

public class ThreadExample extends Thread {

	public ThreadExample(String name) {
		
		super(name);
		

	}
	
	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("Interrupted exception has occured: " + e.getMessage());
				

			}
		}
		
	}
		
		public static void main(String[] args) {
			
			//create an object from ThreadExample
			ThreadExample t1= new ThreadExample("Thread 1");
			
			ThreadExample t2= new ThreadExample("Thread 2");
			
			t1.start();
			t2.start();
			
			
			
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
				
				System.out.println("Executing the main thread: ");
				
				System.out.println("The name of the first thread: " + t1.getName());
				
				System.out.println("The name of the second thread: " + t2.getName());
				
				System.out.println("States of the thread: " + t1.getState() + " " + t2.getState());
				

			}
		
	}


