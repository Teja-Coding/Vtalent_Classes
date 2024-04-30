package CricketProject;

import java.util.Scanner;



public class DriverClass {
	public static void main(String[] args) {
		DriverClass d=new DriverClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to see top order INDIA TEAM BATSMANS..\nPress 2 to see top order AUSTRALIA TEAM BATSMANS..\nENTER THE NUMBER: ");
		int num=sc.nextInt();
		
		switch (num) {
		case 1: {
			
		
			System.out.println("INDIA TEAM TOP ORDER\n18)Virat Kohli\n45)Rohit Sharma\n77)Shubman Gill\n1)Kl Rahul\n63)Suryakumar Yadav");
			System.out.println("enter the jersey number: ");
			int jerseyNumber=sc.nextInt();
			
			India india=d.teamIndiaPlayes(jerseyNumber);
			
			System.out.println("------------player status------------------");
			System.out.println("Player Jersey Number: "+india.jerseyNumber);
			System.out.println("Player Name: "+india.PlayerName);
			System.out.println("Date of Birth of player: "+india.Born);
			System.out.println("Birth Place of player:"+india.BirthPlace);
			System.out.println("Batting Style: "+india.BattingStyle);
			System.out.println("No of runs in test cricket:"+india.TestRuns);
			System.out.println("No of runs in one day cricket:"+india.odiRuns);
			System.out.println("No of runs in t20 cricket:"+india.t20Runs);
			System.out.println("------------------------------------------------");
			
			break;

		}
		case 2:{
			System.out.println("AUSTRALIA TEAM TOP ORDER\n49)StevenSmith\n31)DavidWarner\n77)Shubman Gill\n1)Kl Rahul\n63)Suryakumar Yadav");
			System.out.println("enter the jersey number: ");
			int jerseyNumber1=sc.nextInt();
			Australia australia=d.teamAusralia(jerseyNumber1);
			

			System.out.println("------------player status------------------");
			System.out.println("Player Jersey Number: "+australia.jerseyNumber);
			System.out.println("Player Name: "+australia.PlayerName);
			System.out.println("Date of Birth of player: "+australia.Born);
			System.out.println("Birth Place of player:"+australia.BirthPlace);
			System.out.println("Batting Style: "+australia.BattingStyle);
			System.out.println("No of runs in test cricket:"+australia.TestRuns);
			System.out.println("No of runs in one day cricket:"+australia.odiRuns);
			System.out.println("No of runs in t20 cricket:"+australia.t20Runs);
			System.out.println("------------------------------------------------");
			break;
		
		}
		default:
			System.out.println("--");
		}
	}
	India teamIndiaPlayes(int jerseyNumber){
		India ind=new India();
		if(jerseyNumber==18) {
			ind.jerseyNumber=18;
			ind.PlayerName="Virat Kohli";
			ind.Born="nov-05-1988";
			ind.BirthPlace="Delhi";
			ind.BattingStyle="Right Handed bat";
			ind.TestRuns=8416;
			ind.odiRuns=12898;
			ind.t20Runs=4008;
		}
			
			else if(jerseyNumber==45) {
				ind.jerseyNumber=45;
				ind.PlayerName="Rohit Sharma";
				ind.Born="April-30-1987";
				ind.BirthPlace="Nagpur,Maharashtra";
				ind.BattingStyle="Right Handed bat";
				ind.TestRuns=3379;
				ind.odiRuns=9825;
				ind.t20Runs=3853;
				
			}
			else if(jerseyNumber==77) {
				ind.jerseyNumber=77;
				ind.PlayerName="Shubman Gill";
				ind.Born="Sep-08-1999";
				ind.BirthPlace="Punjab";
				ind.BattingStyle="Right Handed bat";
				ind.TestRuns=890;
				ind.odiRuns=1311;
				ind.t20Runs=202;
				
			}
			else if(jerseyNumber==1) {
				ind.jerseyNumber=01;
				ind.PlayerName="Kl Rahul";
				ind.Born="April-18-1992";
				ind.BirthPlace="Mangaluru,Karnataka";
				ind.BattingStyle="Right Handed bat";
				ind.TestRuns=2642;
				ind.odiRuns=1986;
				ind.t20Runs=2265;
			}
			else if(jerseyNumber==63) {
				ind.jerseyNumber=63;
				ind.PlayerName="Suryakumar Yadav";
				ind.Born="September-14-1990";
				ind.BirthPlace="Mumbai,Maharashtra";
				ind.BattingStyle="Right Handed bat";
				ind.TestRuns=2642;
				ind.odiRuns=1986;
				ind.t20Runs=2265;
			}
			else {
				System.out.println("player is not found in top order batsman list");
			}
		
		return ind;
	
	}
	Australia teamAusralia(int jerseyNumber1) {
		Australia aus = new Australia();
		if(jerseyNumber1==49) {
		aus.jerseyNumber=49;
		aus.PlayerName="Steven Smith";
		aus.Born="june-02-1989";
		aus.BirthPlace="Sydney,New South wales";
		aus.BattingStyle="Right Handed bat";
		aus.TestRuns=8792;
		aus.odiRuns=4939;
		aus.t20Runs=1008;
		}
		else if(jerseyNumber1==31) {
			aus.jerseyNumber=31;
			aus.PlayerName="David Warner";
			aus.Born="Oct-27-1986";
			aus.BirthPlace="Paddington,New South Wales";
			aus.BattingStyle="Left Handed Bat";
			aus.TestRuns=8158;
			aus.odiRuns=6030;
			aus.t20Runs=2894;
		}
		else if(jerseyNumber1==56) {
			aus.jerseyNumber=56;
			aus.PlayerName="Mictchell Marsh";
			aus.Born="Oct-20-1991";
			aus.BirthPlace="Attadale Perth";
			aus.BattingStyle="Right Handed bat";
			aus.TestRuns=1260;
			aus.odiRuns=2008;
			aus.t20Runs=1086;
		}
		else if(jerseyNumber1==62) {
			aus.jerseyNumber=62;
			aus.PlayerName="Travis Head";
			aus.Born="Dec-29-1993";
			aus.BirthPlace="Adelaide, South Australia";
			aus.BattingStyle="Left Handed bat";
			aus.TestRuns=2361;
			aus.odiRuns=1912;
			aus.t20Runs=345;
		}
		else if(jerseyNumber1==33) {
			aus.jerseyNumber=33;
			aus.PlayerName="Marnus Labuschagne";
			aus.Born="June-22-1994";
			aus.BirthPlace="Klerksdorp,South Africa";
			aus.BattingStyle="Right Handed bat";
			aus.TestRuns=3394;
			aus.odiRuns=847;
			aus.t20Runs=2;
		}
		else {
			System.out.println("player is not found in top order batsman list");
		}
		
		return aus;
	}
}