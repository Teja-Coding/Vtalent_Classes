package org.com.ThreadMethods;

public class JoinMethodExample {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+"--->"+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		t1.setName("manikanta");
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(Thread.currentThread().getName()+"--->"+i);
					try {
						Thread.sleep(500);
						Thread.yield();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}
		};
		t2.setName("uma");
		t1.start();
		t1.join();
		t2.start();
		
	}
}
				
