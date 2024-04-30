package com.app.org.playerObject;

//Take a Player class with id, name, age properties

public class DriverClass {
	public static void main(String[] args) {
		DriverClass dc=new DriverClass();
		PlayerClass pc=new PlayerClass();
		
		pc.playerId=07;
		pc.playerName="Dhoni";
		pc.playerAge=45;
		pc.playerTeam="India";
		
		dc.print(pc);
	}
	void print(PlayerClass p) {
		System.out.println("player id: "+p.playerId);
		System.out.println("player name: "+p.playerName);
		System.out.println("player age: "+p.playerAge);
		System.out.println("player team: "+p.playerTeam);
		System.out.println("--------------------------------------");
		
	}
}
