package src;

import java.math.BigInteger;
import java.util.Scanner;

/* 
 * # Date: 01-11-2023
 * WAP to Handle factorials of large numbers using BigInteger.
 * 
 */

public class BigIntergerFactorial {

    static int takeInput(){

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inputs =  sc1.nextInt();
        sc1.close();
        return inputs;
    }
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        int n = takeInput();

        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }
}
