package MethodWithReturnType;

public class EligibleToVote {
	    
	/*    public static void main(String[] args) {
	    
	        boolean isEligible = checkEligibility(22);
	        if(isEligible) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote.");
	        }
	    }
	    
	    public static boolean checkEligibility(int age) {
	        if(age >= 18) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}*/
	
	String vote(int age) {
		if(age>=18) {
			return "your eligible to vote.";
		}
		else {
			return "not eligible";
		}
		
	}
	public static void main(String[] args) {
		EligibleToVote uma= new EligibleToVote();
		System.out.println(uma.vote(15));
		
	}
}
