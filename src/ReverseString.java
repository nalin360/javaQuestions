package src;
import java.util.Scanner;

/**
 * ReverseString
 */

public class ReverseString {

    public String revString(String str){
        if (str.trim().isEmpty()){
            // If the input string is empty, return it
            System.out.println("Empty String");
            return str;
        }else{
            // Reverse the substring and append the first character
            return revString(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc1.next();

        // Call the revString method to reverse the input string
        ReverseString revobj = new ReverseString();
        String newStr = revobj.revString(str);

        System.out.println(newStr);
        sc1.close();

    }
}
