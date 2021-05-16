package ArrayIVQuestions;

import java.util.ArrayList;

public class DeleteSubsequentDuplicateCharacters {

    public static void main(String[] args) {

        /*Given a string, remove subsequent duplicate characters until we get a unique set of characters.
        Ex: input ==> apple ; expected output ==> ale
        */
        String a = "apple";

        //Split the  word apple in an array of characters. This will be the outer Array
        char[] cArray = a.toCharArray();
        System.out.println(cArray.length);

        //This will be the inner Array.
        char[] dArray = a.toCharArray();

        ArrayList<Character> uniqueArrayList = new ArrayList<Character>();
        int j;
        for (int i = 0; i < cArray.length; i++) {
            j = 0;
            for (int k = 0; k < dArray.length; k++) {
                if (cArray[i] == dArray[k]) {
                    //Than increase counter by 1
                    j++;
                    System.out.println("Value of :" + cArray[i] + "==" + dArray[k] + "j=" + j);
                }
            }
            if (j == 1) {
                uniqueArrayList.add(cArray[i]);
        }
        }
        System.out.println("After deleting the subsequent character: " + uniqueArrayList);


        //String input = "aaaaBbBBBbCDdefghiIIiJ";
        String value = "Amazon is a good comapny";
        value = value.replaceAll("(?i)(.)\\1+","$1");
        System.out.println("Value of :" + value);

    }



    }

