package ArrayIVQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class SecondGreatestNumberArray {

    public static void main (String[] args){

        /*
         * How to get the 2nd greatest number in an array?
         * Array = {2,33,9.50,80,100,200,100,9.50,210,100,210}
         */

        int[] intArray={2,33,9,80,100,200,100,9,210,100,210,85};

        //1. Sort Array in ascending order
        Arrays.sort(intArray);

        //Sort Array in descending order
        //Arrays.sort(intArray, Collections.reverseOrder())

        //2. Pass Array to LinkedHashSet as it cannot have duplicate elements
        Set<Integer>lhashSet = new LinkedHashSet<Integer>();
        Collections.addAll(lhashSet,Arrays.stream(intArray).boxed().toArray(Integer[]::new));
        System.out.println("Showing Array without duplicate elements: " + lhashSet);

        //3.Convert sorted LinkedHashSet to an Array (Remember: whenever a set/arraylist is converted to array, the new array has to be data type=object)
        Object[] objects = lhashSet.toArray();
        int size = objects.length;
        System.out.println("Size of an Array is = "+ size);

        //4. Print out the second last index from the array
        System.out.println("Second greatest number in the Array is ="+ objects[size-2]);

        /**
         * Method to generate the random number
         * @return
         */
//        private int getRandomNumber() {
//            double randNumber = Math.random();
//            double d = randNumber * 2;
//            int randomInt = (int)d + 1;
//            return randomInt;
//        }

    }


}
