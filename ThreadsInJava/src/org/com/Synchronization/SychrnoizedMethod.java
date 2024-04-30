package org.com.Synchronization;

public class SychrnoizedMethod implements Runnable{
	public synchronized void printNum() {
		for(int i=1;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+"---->"+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printNum();
	}
	public static void main(String[] args) {
	SychrnoizedMethod s= new SychrnoizedMethod();
	Thread t=new Thread(s);
	t.setName("manikanta");
	t.start();
	
	Thread t1=new Thread(s);
	t1.setName("uma");
	t1.start();
	}
	
}
