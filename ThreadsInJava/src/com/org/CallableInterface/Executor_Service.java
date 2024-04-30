package com.org.CallableInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_Service implements Callable{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		System.out.println("call ( ) - method executed..."+Thread.currentThread().getName());
		return "success";
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//using executor service we can implement multithreading
		Executor_Service es=new Executor_Service();
		
		//using executors we can create thread pool....
		ExecutorService executorService=Executors.newFixedThreadPool(20);
		
		for(int i=1;i<20;i++) {
			Future submit=executorService.submit(es);
			System.out.println(submit.get().toString());
			
		}
		executorService.shutdown();
	}

}
