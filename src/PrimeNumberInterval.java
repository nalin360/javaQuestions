package src;

import java.util.Scanner;

public class PrimeNumberInterval {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner takeInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(isPrime( takeInput.nextInt()) ? "is a prime number " : "its not a prime number " );
        takeInput.close();
    }
}
