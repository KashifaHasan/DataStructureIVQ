package StringIVQuestions;

public class RefactorCodeForAddTenPercentToString {

    public static void main(String[] args) {
        String a = "abc31de54op";
        int aLen =a.length();//finding the length = 7
        StringBuilder str = new StringBuilder();

        Boolean flag = false;
        Boolean StartFlag = false;
        Boolean EndFlag = false;
        int intY = 0;
        int X;

        //i=0-->'a'; i=1-->'b';i==2-->'c';i=3-->'3';i=4-->'1';i=4-->'d'
        //StartFlag=false................;StartFlag=true,EndFlag = true;

        //When the starting point is 0 we increment it until it reaches highest index of array (length-1)
        for (int i = 0; i <= aLen - 1; i++) {

            //TRUE
            flag = Character.isDigit(a.charAt(i));//for 'a'-->false
            if (flag) {//enter if block when flag=true
                str.append(a.charAt(i)); //str="31" in the StringBuilder format
                StartFlag = true;
            }
            else {//enter if block when flag=false
                if (StartFlag) {//enter if block when StartFlag=true
                    EndFlag = true;
                }
                if (StartFlag && EndFlag) {//enter if block when StartFlag=true && EndFlag=true
                    //Convert StringBuilder to String
                    String a1=str.toString();
                    //Convert String to Integer
                    X = Integer.parseInt(a1);//31

                    intY = X + (int) (0.1 * X);//34.1
                    StartFlag = false;
                    EndFlag = false;
                    str.delete(0, str.length());
                    System.out.print(intY);//34.1
                    System.out.print(a.charAt(i));//d
                } else {
                    System.out.print(a.charAt(i));//a,b,c
                }
            }

        }
        System.out.println();
    }
}
