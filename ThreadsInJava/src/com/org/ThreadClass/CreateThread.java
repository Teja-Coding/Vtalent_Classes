package com.org.ThreadClass;

public class CreateThread  extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is crated with help of thread...");
		System.out.println("hello thread how are you....");
	}
	public static void main(String[] args) {
		
		CreateThread createThread=new CreateThread();
		Thread t=new Thread(createThread);
		
		t.start();
	}
}
		