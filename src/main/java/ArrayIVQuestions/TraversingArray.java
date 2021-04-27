package ArrayIVQuestions;

public class TraversingArray {

    public static void main (String args[]){
        //Find the sum of digits in a number traversing from back to front and vice versa of an Array
        int number = 542358;
        String strNumber = String.valueOf(number);
        String [] arr = strNumber.split("");

        int sum =0;
        int sum1=0;

        //From front to back
        for(int i=0; i<arr.length;i++){
            //Parsing the String to Int. arr[i] over here to iterate the value of array we are inserting an i
            int inum=Integer.parseInt(arr[i]);
            //sum = 0+5
            sum = sum + inum;
        }
        //From back to front, length-1 means we are starting from the highest index. We are decrementing the value by i-- and we will do it till i reaches to 0.
        //When the starting point is highest index, we decrement until it reaches i =0.
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(""+arr[i]);
            int inum = Integer.parseInt(arr[i]);
            sum1 = sum1 + inum;
        }
        System.out.println("Value of sum ="+ sum);
        System.out.println("Value of sum1 ="+ sum1);
        System.out.println("Value of Summation on Digits in the given number"+(sum*2));
    }
}
