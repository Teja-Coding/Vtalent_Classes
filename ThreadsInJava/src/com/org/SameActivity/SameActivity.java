package com.org.SameActivity;

public class SameActivity implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() methods..."+Thread.currentThread().getName());
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run() method ended.."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		SameActivity sa=new SameActivity();
		Thread t1=new Thread(sa);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Thread-1");
		t1.start();
		
		Thread t2=new Thread(sa);
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.setName("Thread-2");
		t2.start();
		
		Thread t3=new Thread(sa);
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.setName("Thread-3");
		t3.start();
		
		//t1.start();
		
	}

}
