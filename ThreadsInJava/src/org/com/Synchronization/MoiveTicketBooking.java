package org.com.Synchronization;

public class MoiveTicketBooking implements Runnable {
	int aviableTickets=100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(aviableTickets>0) {
			System.out.println("tickets booking opens...");
		}
	}
	public static void main(String[] args) {
		MoiveTicketBooking m=new MoiveTicketBooking();
		Thread t1=new Thread(m);
		
		t1.start();
	}
}

