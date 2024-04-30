package MethodWithReturnType;

import java.util.Scanner;

public class JobDescription {
	/*int input() {
		Scanner sc=new Scanner( System.in);
		System.out.println("enter the year of exp: ");
		return sc.nextInt();
		*/
		
	
	String jobDescription(int exp) {
		
		if(exp>=0 && exp<=2) {
		return "Associate Engineer";
		}
		else if(exp>=3 && exp <=5) {
			return "Software Engineer";
		}
		else if(exp>=6 && exp<=9) {
			return "SR Software Engineer";
		}
		else if(exp>=10 && exp<=13){
			return "Manager";
		}
		else {
			return "role not found";
		}
	}
	public static void main(String[] args) {
		JobDescription jb = new JobDescription();
	
			String result=jb.jobDescription(3);
			System.out.println(result);
	}
	
}
