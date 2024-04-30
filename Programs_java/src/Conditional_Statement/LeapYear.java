package Conditional_Statement;
/* According to the leap year rule, a year is a leap year 
 * if it is divisible by 4 but not divisible by 100, or if it is divisible by 400. 
 * If year satisfies this condition, the code inside the if statement will execute 
 * and the program will print "year is a leap year." If year does not satisfy this condition, 
 * the code inside the else statement will execute and the program 
 * will print "year is not a leap year."*/
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
