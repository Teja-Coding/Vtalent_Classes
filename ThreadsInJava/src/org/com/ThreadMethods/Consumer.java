package org.com.ThreadMethods;

public class Consumer extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			System.out.println("Consumer:consumed item "+i);
			Thread.yield();
		}
	}
}
