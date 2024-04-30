package com.org.ThreadSleep;

public class SleepThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() method started.....");
		try {
			System.out.println("thread is in blocked state");
			Thread.sleep(5000);//
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run() method ended......");
	}
	public static void main(String[] args) {
		SleepThread st=new SleepThread();
		Thread t=new Thread(st);
		t.start();
		t.start();
	}

}
