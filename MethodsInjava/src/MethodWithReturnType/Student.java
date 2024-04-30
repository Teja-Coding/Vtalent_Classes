package MethodWithReturnType;

public class Student {

		public static void main(String[] args) {
			System.out.println("Hi, i am a student");

			Student s1 = new Student();
			s1.hello();

			Student.greet();
		}

		void hello() {
			System.out.println("Hello My Friend...");
		}

		static void greet() {
			System.out.println("Good Evening..");
		}
}
