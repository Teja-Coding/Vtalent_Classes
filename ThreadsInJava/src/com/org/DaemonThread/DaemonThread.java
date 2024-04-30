package com.org.DaemonThread;

public class DaemonThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread exceuted......");
		}
		else {
			System.out.println("normal thread executed......");
		}
	}
	public static void main(String[] args) {
		DaemonThread dt=new DaemonThread();
		Thread t1=new Thread(dt);
		t1.setDaemon(false);
		t1.start();
	}

}
