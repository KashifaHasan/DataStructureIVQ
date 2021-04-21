package CollectionsIVQuestions;


public class FactorialProblems {

    public static void main (String args[]){

        // Find the factorial of 4
        int number =4,result;
        result = factorial(number);
        System.out.println( number  +  " factorial = " + result );
    }

    static int factorial(int n){
        if(n!=0) //termination condition
            return n * factorial(n-1); //recursive call
        else
            return 1;
    }




}
