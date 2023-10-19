package src;
import java.util.Scanner;

public class Palindrom { 

    public String revString(String str){
        // System.out.println( "str : " + str.length());
        if (str.isEmpty()){
            // If the input string is empty, return it
            // System.out.println("Empty String");
            return str;
        }else{
            // Reverse the substring and append the first character
            return revString(str.substring(1)) + str.charAt(0);
        }
    }

    
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner userInput = new Scanner(System.in);
        String orignalInput = userInput.next();

        Palindrom rev = new Palindrom();
        String reverseString = rev.revString(orignalInput);

        userInput.close();
        if (orignalInput != reverseString) {
            System.out.println(reverseString + " its a plaindrom");
        } else {
            System.out.println(reverseString + " its not a palindrom ");
        }
    }

    
}
