package CollectionsIVQuestions;

import java.util.Scanner;

public class DivisibleNumber {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number =in.nextInt();

        if(number ==0){
            System.out.println("Enter a Non-Zero integer value");
        }
        else if(number%32==0){
            System.out.println("ANIMAL");
        }
        else if(number%16==0){
            System.out.println("ANIM");
        }
        else if(number%8==0){
            System.out.println("AN");
        } else {
            System.out.println("Number is not divisible by 8,16 or 32");
        }

    }


}
