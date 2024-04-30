package org.com.RbiBank;

public class SbiBank extends RbiBank {
	// overriding parent method to give my own rofi
		double getHomeLoanRofi() {
			return 12.85;
		}

		public String applyHomeLoan() {
			boolean status = checkElgibility(); // parent method
			if (status) {
				double homeLoanRofi = getHomeLoanRofi(); // child method
				String msg = "Your loan approved with RI as ::" + homeLoanRofi;
				return msg;
			} else {
				return "You are not elgible for home loan";
			}
		}

		public static void main(String[] args) {
			SbiBank bank = new SbiBank();
			
			String msg = bank.applyHomeLoan();
			System.out.println(msg);
		}
	}
