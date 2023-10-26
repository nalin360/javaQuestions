package src;

import java.util.Scanner;

/* 
 * Date: 26-10-2023. 
 * Write a Java program to generate the Fibonacci sequence. 
 * The program should take an integer 'n' as input and display 
 * the Fibonacci sequence up to the 'n'-th term.
 * 
 */
/**
 * FibonacciSequence
 */
public class FibonacciSequence {
    public static int recursiveFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner takeinput = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = takeinput.nextInt(); 
        takeinput.close();
        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 0; i < n; i++) {
            int result = recursiveFibonacci(i);
            System.out.print(result);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
    
}