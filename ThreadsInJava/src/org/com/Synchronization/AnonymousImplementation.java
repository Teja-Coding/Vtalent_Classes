package org.com.Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class AnonymousImplementation {
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("run()method logic-1");
			}
		};
		t1.start();
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run method() logic-2");
			}
		};
	}
}
