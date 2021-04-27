package StringIVQuestions;

public class AddTenPercentToString<aLen> {

    /**
     * Parse a string, extract the number in that string, add 10% to that number then print the string with new value.
     * <p>
     * First split the string into string array,
     * then iterate over that array,
     * find the string that contains the number,
     * convert that string into integer then add 10% to that and store back new value for that string.
     * Then convert string array back to string using StringBuilder
     */

    public static void main(String arga[]) {

        String a = "abc31de";
        int aLen =a.length();
        StringBuilder str = new StringBuilder();
        Boolean flag = false;
        Boolean StartFlag = false;
        Boolean EndFlag = false;
        int intY = 0;
        int X;

        //i = o-->'a',i = 1-->'b',i = 2-->'c',i = 3-->'3',i = 4-->'1',i = 5-->'d',i = 6-->'e',
        //When the starting point is 0 we increment it until it reaches highest index of array (length-1)
        for (int i = 0; i <= aLen - 1; i++) {

            flag = Character.isDigit(a.charAt(i));//isDigit, its a build in method of Character contains integer or not
            if (flag) { //enter if block when flag = true
                str.append(a.charAt(i));//str="31" in the StringBuilder format
                StartFlag = true;
            } else { //enter if block when flag = false
                if (StartFlag) { //enter if block when Startflag = true
                    EndFlag = true;
                }
                if (StartFlag && EndFlag) {  //enter if block when Startflag && endFlag = true
                    //Convert StringBuilder to String
                    X = Integer.parseInt(str.toString());
                    intY = X + (int) (0.1 * X);
                    StartFlag = false;
                    EndFlag = false;
                    System.out.println(intY);
                    System.out.println(a.charAt(i));
                } else {
                    System.out.println(a.charAt(i));
                }
            }

        }
    }

}
