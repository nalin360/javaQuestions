package src;

import java.util.Scanner;

/**
 * WordCount
 */
public class WordCount {

    public static void main(String[] args) {
        
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Enter a word ");
        String word = takeInput.nextLine();

        System.out.println( "Total number of words are " + 
            word.length()
        ); 
        takeInput.close();

    }
}