package src;

import java.util.Scanner;

/**
 * Date: 02-11-2023. 
 * Write a program to print pyramid pattern using loop
 */
public class TrianglePattern {

    static void printPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner takeinput = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        printPyramid(takeinput.nextInt());

        takeinput.close();
    }    
}