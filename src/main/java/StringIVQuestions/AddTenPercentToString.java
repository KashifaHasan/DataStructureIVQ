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
        for (int i = 0; i <= aLen - 1; i++) {

            flag = Character.isDigit(a.charAt(i));
            if (flag) {
                str.append(a.charAt(i));
                StartFlag = true;
            } else {
                if (StartFlag) {
                    EndFlag = true;
                }
                if (StartFlag && EndFlag) {
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
