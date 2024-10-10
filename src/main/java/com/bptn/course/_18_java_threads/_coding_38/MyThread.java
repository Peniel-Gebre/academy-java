package com.bptn.course._18_java_threads._coding_38;

public class MyThread extends Thread {
    // Instance variable
    private int limitToStop;

    // Create a constructor to initialize the above instance variable

    public MyThread(int limitToStop) {
        this.limitToStop = limitToStop;
    }

    // Override the run() method here.
    @Override
    public void run() {
        // For loop to print only odd numbers from 0 to limitToStop
        for (int i = 0; i <= limitToStop; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    // Sleep for 1 second after printing each odd number
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}