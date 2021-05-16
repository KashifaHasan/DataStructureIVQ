package CollectionsIVQuestions;

import java.util.Scanner;

public class AddTenPercentNumber {

    //Parse a string, extract the number in that string, add 10% to that number than print the string with new value.

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        String number = in.next();

        int numberInInteger = Integer.parseInt(number);
        System.out.println(numberInInteger);
        double result = numberInInteger + (numberInInteger * 0.1);
        System.out.println("Value of Result :" + result);

    }
}
