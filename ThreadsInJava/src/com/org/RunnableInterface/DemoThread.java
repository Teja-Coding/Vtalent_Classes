package com.org.RunnableInterface;

public class DemoThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() method started");
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println("run() method ended....");
	}
	public static void main(String[] args) {
		DemoThread d=new DemoThread();
		Thread t = new Thread(d);
		Thread t2 = new Thread(d);
		
		t.start();
		t2.start();
		
		t.run();

	}

}