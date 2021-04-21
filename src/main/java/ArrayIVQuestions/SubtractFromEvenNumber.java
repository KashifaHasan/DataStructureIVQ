package ArrayIVQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SubtractFromEvenNumber {

    public static void main(String args[]){

        //Given an Array with numbers 1-5, how would you subtract from every EVEN number in each index

        int [] a = IntStream.range(1,6).toArray();
        List<Integer> strList = new ArrayList<Integer>();

        for(int i =0;i<a.length;i++){
            if(a[i]%2==0){
                int newNum = a[i]-1;
                strList.add(newNum);

            }
            else
                strList.add(a[i]);
        }
        System.out.println(strList);

    }



}
