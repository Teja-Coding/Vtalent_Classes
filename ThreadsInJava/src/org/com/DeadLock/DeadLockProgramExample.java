package org.com.DeadLock;

public class DeadLockProgramExample {
	public static void main(String[] args) {
		
		
	String s1="hi";
	String s2="hello";
	
	Thread t1=new Thread() {
		public void run() {
			synchronized (s1) {
				System.out.println("Thread-1 locked resourse-1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (s2) {
					System.out.println("Thread-1 wait for resource-2");
				}
			}
		}
	};
	Thread t2=new Thread() {
		public void run() {
			synchronized (s2) {
				System.out.println("Thread-2 locked resource-2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (s1) {
					System.out.println("Thread-2 waiting for resource-1");
				}
			}
			
		}
		
	};
	t1.start();
	t2.start();
	}
}
