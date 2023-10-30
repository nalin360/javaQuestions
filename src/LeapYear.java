package src;

import java.util.Scanner;

/* 
 * Date: 30-10-2023.
 * WAP to Determine if a given year is a leap year.
 * 
 */
public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner takeInput = new Scanner(System.in);
        System.out.print("Enter a leap year : ");
        int year = takeInput.nextInt();
        System.out.println(
            (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) 
            ? year + " is Leap Year" : year + " : Non - Leap Year"
        );
        takeInput.close();
    }
}
