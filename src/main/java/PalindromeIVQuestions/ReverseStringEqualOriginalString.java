package PalindromeIVQuestions;

import java.util.Scanner;

public class ReverseStringEqualOriginalString {

    public static void main(String[] args) {

    /*
  Scenario: A string will be given by the user.
  We have to check if the given string is Palindrome or not.
  Note: Palindrome means if the reverse of the string is equal to the original string.
  For e.g. Mom, Anna those are Palindrome String but Java is not a Palindrome String.
  */
        //Declaring 2 empty variable strings
        String original, reverse = "";

        //Taking input from the user using System.in Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a Palindrome");

        original=in.nextLine();
        //We took the length of the String to iterate to the last character
        int length = original.length();
        for(int i= length-1; i>=0;i--){// i will store the length of the character and we have to subtract 1 since the indexing starts from 0 and each time we have to subtract it since at the first we have the last character.And will move to the first character by subtracting 1 each time.
            reverse = reverse + original.charAt(i);//We have to append each character to the reverse string
        }
        if(original.equalsIgnoreCase(reverse)){
            System.out.println("Given String is a Palindrome");
        } else {
            System.out.println("Given String is not a Palindrome");
        }

    }
}
