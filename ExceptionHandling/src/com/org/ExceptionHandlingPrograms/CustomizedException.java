package com.org.ExceptionHandlingPrograms;

public class CustomizedException {
	
		void m1(int age) throws Exception {
			if(age>=18) {
				System.out.println("age is legal");
		}
			else {
				throw new Exception("age is not legal");
			}
	}
		public static void main(String[] args) {
			CustomizedException ce=new CustomizedException();
			try {
				ce.m1(15);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}