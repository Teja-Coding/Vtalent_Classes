package MethodWithReturnType;
/*a man takes 12 secs to cross a bridge of length 600 meter 
 * find his speed m kms/hr */
public class FindSpeed {
	int findSpeed(int distance,int time) {
		return distance/time;
	}
	void printSpeed(int speed) {
		System.out.println("a man travels at the speed of "+(speed*18/5)*2+ " kms/hr ");
	}
	public static void main(String[] args) {
		FindSpeed fs=new FindSpeed();
		int speetInMeterPerSec=fs.findSpeed(600, 12);
		fs.printSpeed(speetInMeterPerSec);
	}
}
