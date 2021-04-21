package ArrayIVQuestions;

public class TraversingArray {
//Confused__________________
    public static void main (String args[]){
        //Find the sum of digits in a number traversing from back to front and vice versa of an Array
        int number = 542358;
        String strNumber = String.valueOf(number);
        String [] arr = strNumber.split("");

        int sum =0;
        int sum1=0;

        for(int i=0; i<arr.length;i++){
            System.out.println(""+arr[i]);
            int inum=Integer.parseInt(arr[i]);
            sum = sum + inum;
        }

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(""+arr[i]);
            int inum = Integer.parseInt(arr[i]);
            sum1 = sum + inum;
        }
        System.out.println("Value of sum ="+ sum);
        System.out.println("Value of sum1 ="+ sum1);
        System.out.println("Value of Summation on Digits in the given number"+(sum*2));
    }
}
