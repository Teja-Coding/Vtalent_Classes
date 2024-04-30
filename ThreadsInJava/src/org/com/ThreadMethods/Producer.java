package org.com.ThreadMethods;

public class Producer extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			System.out.println("Producer:Produced Item "+i);
			Thread.yield();
		}
	}
}
