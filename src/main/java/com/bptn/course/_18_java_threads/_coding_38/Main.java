package com.bptn.course._18_java_threads._coding_38;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyThread and pass 20 as the limit
        MyThread myThread = new MyThread(20);
        
        // Start the thread
        myThread.start();
    }
}