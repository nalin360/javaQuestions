package src;

import java.util.Scanner;

/* 
 * 27-10-2023. 
 * WAP to Convert a binary number to its decimal equivalent
 * 
 */
public class BinaryToDecimal {
    
    public static void main(String[] args) {
        
        Scanner takeinput = new Scanner(System.in);

        System.out.print("Enter binary : ");
        String binary = takeinput.nextLine();
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Binary " + binary + " Decimal " + decimal);
        takeinput.close();
    }
}
