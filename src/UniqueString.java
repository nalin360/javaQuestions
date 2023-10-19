package src;
import java.util.Scanner;

/* 
 * Date: 16-10-2023. 
 * Write a Java program to identify and 
 * print the first unique character in a given string.
 * 
 */

public class UniqueString {
    
    public static char firstUniqChar(String s) {
        // Initialize a boolean flag to keep track of unique characters.
        boolean flag = true ; 
        
        // Loop through each character in the string.
        for(int i = 0 ; i < s.length() ; i++ ) { 
            flag = true ; 
            // Get the current character at index i.
            char ch = s.charAt(i); 

            // Nested loop to compare the current character with all other characters.
            for(int j = 0 ; j < s.length() ; j++ ) { 
                // Skip comparing the character with itself.
                if(j == i ) 
                    continue ;

                if(ch == s.charAt(j)) { 
                    // If a matching character is found
                    flag = false ;
                    break ;
                }
            }

            // If the flag remains true, the character at index i is unique, so return its index.
            if(flag) 
                return s.charAt(i) ;
        }

        // If no unique character is found in the entire string, return -1.
        return '#' ; 
    }

    public static void main(String[] args) {
    
        System.out.print("Enter any string : ");
        Scanner takeinput = new Scanner(System.in);
        String input = takeinput.nextLine();

        takeinput.close();
        char unique = firstUniqChar(input);
        if(unique != '#'){
            System.out.println(unique + " is first unique character");
        }else{
            System.out.println("there is no unique character");
        }

        
    }
    
}
