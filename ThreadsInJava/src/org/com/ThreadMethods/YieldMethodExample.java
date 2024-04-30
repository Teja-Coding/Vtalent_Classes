package org.com.ThreadMethods;

public class YieldMethodExample {
	public static void main(String[] args) {
		Thread Producer=new Producer();
		Thread Consumer=new Consumer();
		Producer.start();
		Consumer.start();
	}
}
