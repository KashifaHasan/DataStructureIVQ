package ArrayIVQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SubtractFromEachIndex {

    public static void main (String args[]){

        /** Given an array with numbers 1-5, how would you subtract one number from each index? */
        int[] a = IntStream.range(1, 6).toArray();
        List<Integer> strList = new ArrayList<Integer>();
        for (int i=0; i<a.length;i++) {
            int newNum = a[i]-1;
                strList.add(newNum);
                }
        System.out.println(strList);

    }

}
