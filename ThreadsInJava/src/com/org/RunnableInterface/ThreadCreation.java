package com.org.RunnableInterface;

public class ThreadCreation implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("creating thread with help of runable interface....");
		System.out.println("hi thread how are you....");
	}
	
	public static void main(String[] args) {
		ThreadCreation threadCreation = new ThreadCreation();
		
		Thread t=new Thread(threadCreation);
	
		t.start();
		
	}
	
}