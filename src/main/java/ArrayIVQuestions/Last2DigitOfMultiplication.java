package ArrayIVQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Last2DigitOfMultiplication {

    public static void main(String[] args) {

        /** Given an array of n length containing number 1 to 99 . print last 2 digit of result after multiplying all the n numbers in array.*/
        int[] a = IntStream.range(1, 100).toArray();
//System.out.println(a.length);

        List<String> strList = new ArrayList<String>();

        for (int i=0; i<a.length;i++) {
            int newNum= a[i]*2;//int
            String strNum = String.valueOf(newNum);//string

            if (strNum.length()<2) {//this will handle all single digit result
            //System.out.println("0"+strNum);
            strList.add("0"+strNum);
                    }
                else if(strNum.length()==2) {//this will handle all double digit result
                     //System.out.println(strNum);
            strList.add(strNum);
            }
            else if(strNum.length()>2) {//3-->last 2 digit
            String[] b = strNum.split("");//128
            String finalNum = b[b.length-2]+b[b.length-1];
            //System.out.println("This is the string Num" + strNum);
            //System.out.println(finalNum);
            strList.add(finalNum);
            }
                }
        System.out.print(strList);

    }


}
