# DataStructureIVQ

DataStructureIVQ
DataStructurePractice Questions With Possible Solutions Given a string, remove subsequent duplicate characters until we get a unique set of characters. Ex: input ==> apple ; expected output ==> ale Ex: input ==>appapple; expected output ==>le

The input will be in char array. char[] removeDupes(Char[] inputString){ }

1st Solution /*Given a string, remove subsequent duplicate characters until we get a unique set of characters. Ex: input ==> apple ; expected output ==> ale Ex: input ==>appapple; expected output ==>le */ import java.util.ArrayList; public class RemoveDuplicateCharacters {

public static void main(String[] args) { // TODO Auto-generated method stub String S = "appapple" int sLen = S.length(); ArrayList alStr = new ArrayList(); ArrayList rejectStr = new ArrayList(); Boolean flag; for(int i =0;i< sLen;i++) { flag = true; for(int j=i+1;j< sLen; j++) { if(S.charAt(j)==S.charAt(i) || rejectStr.contains(S.charAt(i))) { flag = false; rejectStr.add(S.charAt(i)); break; } //If condition } //for loop j if(flag == true) { alStr.add(S.charAt(i)); } //If condition

} //For Loop i System.out.println(alStr);

}

}

2nd Solution

public String returnSimplifiedString() { Scanner scan = new Scanner(System.in); System.out.println("Enter a string: "); String s = scan.nextLine(); String retVal = "" ArrayList temp = new ArrayList(); for(char ch: s.toCharArray()) temp.add(s.charAt(ch)); for(char ch: temp) { if(Collections.frequency(temp, ch) == 1) { retVal = retVal+ch; } } return retVal; }

3rd Solution

char[] removeDupes(char[] inputString) { Set set = new LinkedHashSet(); for(char ch : inputString) { if(set.contains(ch)) { set.remove(ch); } else { set.add(ch); } } char[] newarr=new char[set.size()]; int index=0; for(Character cr : set) { newarr[index++]=cr; } return newarr; }

Checking a given number in binary form - a palindrome or not.

Solution

public class Pal {

public static void main(String[] args) { // TODO Auto-generated method stub

String A ="madam" String flag = "true" int i= 0; System.out.println("i =" + i); int j = A.length()-1; //System.out.println("j =" + j); //System.out.println(A.charAt(j)); while(i=0) {

if ((A.charAt(i) !=A.charAt(j))) { flag = "false" } i++; System.out.println("i =" + i); j--; System.out.println("j =" + j); } System.out.println(flag); }

}

How to get the 2nd greatest number in an array?

1st Solution //Finding second greatest number .Procedure 1 public static int findSecondGreatest(int[] a) { Arrays.sort(a); return a[a.length-2]; }

2nd Solution

public static int findSecondGreatest(int[] a) { int max1=Integer.MIN_VALUE; int max2=Integer.MIN_VALUE; for(int i=0;imax1) { max2=max1; max1=a[i]; } else if(a[i]>max2) { max2=a[i] } } return max2; }

Find a pair such that the product is maximum.

I did it in nlogn time complexity by sorting the array and find 2 minimum and 2 maximum elements from array. But I was told to improve it. I did it in O(n) complexity by directly finding 2 minimum and 2 maximum elements from array. I further improved by solving it in O(logn) time complexity by using heap tree.Sort and last two elements will be the answer.

Check if first string is anagram of second. I did it in O(n) time complexity by using HashMap in Java.

How to automate an API that retrieves bank, card holder information based on Credit card number is given as input.

Write a function in any language that will print "AN" if a number is divisible by 8, "ANIM" if divisible by 16 and "ANIMAL" if divisible by 32.

1st Solution Good work. I checked your code and it runs. This is a variation on the classic FizzBuzz coding question.

One suggestion: You can simplify your code by printing the user prompt in the input function.

i = input("Enter a number or press Q to quit:") Another suggestion: Make the letter "q" case insensitive by passing the ".lower()" method after your input string

i = input("Enter a number or press Q to quit:").lower() One thing: You don't need the following if clause which I've commented out. This condition is already checked and handled outside of the try block. """ try: n = int(i)

if i == "q": print("Goodbye!") """

2nd Solution

I was not strong enough in Python to solve this problem on the spot. But after some study I believe the following would have been a suitable answer:

def numberchecker(): print("Enter Number or Press q to quit:") i = input() if i == "q": print("Good bye!") else: try: n = int(i) if i == "q": print("Good bye!") elif n % 32 == 0: print("ANIMAL") numberchecker() elif n % 16 == 0: print("ANIM") numberchecker() elif n % 8 == 0: print("AN") numberchecker() else: print("Try a diffrent number next time.") numberchecker() except ValueError: print("Entry is unacceptable.") numberchecker()

numberchecker()

3rd Solution

public static String printAnimal(int num) { if (num >= 8 && num = 16 && num = 16 && num < 32) { if (num % 32 == 0) { return "ANIMAL" }

} return "Number Not Divisible by 8"

}

4th Solution

Simple one to solve in Python Coding

def number_divisible(num): if num %32 ==0: print("ANIMAL") elif num %16 ==0: print("ANIM") elif num % 8 ==0: print("AN")

given_num = 8

number_divisible(given_num)

5th Solution

I could add the exceptional handling also to this code, incase input is not an integer, I did not add the code though, but that one simple too to add. given below is the solution with user Input data

user_data = int(input("Enter your Number :")) def number_divisible(user_data): try: num = int(user_data) print("Proceed") if num %32 ==0: print("ANIMAL") elif num %16 ==0: print("ANIM") elif num % 8 ==0: print("AN") else: print("This number is not divisible by 8 or 16 or 32") except: print("Please Enter valid Number")

number_divisible(user_data)

6th Solution

printStringBasedOnDivisibleNumber("AN", 8, 8); printStringBasedOnDivisibleNumber("ANIM", 16, 8); printStringBasedOnDivisibleNumber("ANIMAL", 32, 8);

private static String printStringBasedOnDivisibleNumber(String inputString, int inputNumber, int inputDivisibleNumber) { String outputString = ""

if (inputNumber % inputDivisibleNumber == 0) { outputString = inputString; } else { outputString = "Input number - " + inputNumber + " is not divisble by " + inputDivisibleNumber; } return outputString; }

7th Solution

function main(num) { (num%32 == 0) ? console.log('ANIMAL') : (num%16 == 0) ? console.log('ANIM') : (num%8 == 0) ? console.log('AN') : console.log ('Number not divisible by 8, 16, 32'); }

8th Solution

import java.util.Scanner;

public class PrintAnimal { // Write a function in any language that will print "AN" if a number is // divisible by 8, "ANIM" if divisible by 16 and "ANIMAL" if divisible by 32.

public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.println("Please enter the number:"); int num = s.nextInt(); if (num != 0) { if (num % 8 == 0) { if (num % 16 == 0) { if (num % 32 == 0) { System.out.println("ANIMAL"); } else System.out.println("ANIM"); } else System.out.println("AN"); }

} else { } System.out.println("Entered num not divisle by 8,16,32"); s.close(); }

}

9th Solution

for i in range (1,100): #print(i) if i%8==0 and i%16!=0 and i%32!=0: print("AN") print(i) elif i%32==0: print('ANIMAL') print(i) elif i%16==0 and i%32 !=0: print('ANIM') print(i)

10th Solution

import java.util.*; import java.util.Scanner;

public class Main {

public static void main (String[]args) {

int num ;

Scanner a = new Scanner(System.in); num = a.nextInt();

System.out.println("enter num " +num);

if(num%8==0) { System.out.print("AN"); }

if(num%16==0) { System.out.print("IM"); }

if(num%32==0) { System.out.print("AL"); } } }

Closest Palindrome to the number

Find array contains duplicate numbers

Print numbers in rhombus shape 1 121 12321 121 1

1st Solution /*3. Print numbers in rhombus shape 1 121 12321 121 1 */ public class Rhombus {

public static void main(String[] args) { int intMaxDigit = 3; for(int i=1;i=1;k--) { System.out.print(k); } System.out.println(""); } for(int i=intMaxDigit-1;i>=1;i--) { for (int j=1;j=1;k--) { System.out.print(k); } System.out.println(""); }

} }

2nd Solution

int num = 121; int minnum = num; int maxnum = num;

for (int j = num; j >= num; j++) { var strMinRev = "" var strMaxRev = "" minnum = minnum - 1; maxnum = maxnum + 1; for (int i = num.ToString().Length - 1; i >= 0; i--) {

strMinRev = strMinRev + minnum.ToString()[i]; strMaxRev = strMaxRev + maxnum.ToString()[i]; } if(strMinRev==minnum.ToString()) { Console.WriteLine("Closest Palindrome Number is: " + minnum); break; } if(strMaxRev == maxnum.ToString()) { Console.WriteLine("Closest Palindrome Number is: " + maxnum); break; } }

Given a string, can you remove all duplicate characters in the string. Create result string to append characters if not already in the string.

How to remove duplicates from the list

The first occurrence of the non-repeating character in a string

1st Solution class Solution { public int firstUniqChar(String s) {

if(s.length()==0) return -1;

Map hm = new HashMap(); for(int i=0; i< s.length(); i++) { if(hm.containsKey(s.charAt(i))) { hm.put(s.charAt(i),hm.get(s.charAt(i))+1); } else { hm.put(s.charAt(i),1); }

}

for (int i = 0; i < s.length(); i++) { char c = s.charAt(i); if (hm.get(c) == 1) { return i; } } return 0;

}

}

2nd Solution

public static void main(String[] args) { String s="aaaebbbbbaccc" char[] c=s.toCharArray();

HashMapmp=new HashMap(); for(char d:c){ if(mp.containsKey(d)){ mp.put(d,mp.get(d)+1); }else { mp.put(d,1); }

} for(Map.Entrym:mp.entrySet()){ int i=1; if(m.getValue()==i){ System.out.println(m.getKey()); }

}

}

Find the sum of digits in a number tranversing from back to front and vice versa of an array

Given a number find nearest palindrome.

Given an array of n length containing number 1 to 99 . print last 2 digit of result after multiplying all the n numbers in array.

Parse a string, extract the number in that string, add 10% to that number then print the string with new value.

1st Solution

public class ParseString {

public static void main(String[] args) { // TODO Auto-generated method stub

String a ="abc31de" int aLen = a.length(); StringBuilder str= new StringBuilder(); Boolean flag= false; Boolean StartFlag = false; Boolean EndFlag = false; int intY = 0; int X; for(int i=0;i<=aLen-1;i++) { flag = Character.isDigit(a.charAt(i)); if(flag) { str.append(a.charAt(i)); StartFlag = true; } else { if(StartFlag) { EndFlag = true; } if(StartFlag && EndFlag) { X = Integer.parseInt(str.toString()); intY = X + (int)(0.1*X); StartFlag =false; EndFlag =false; System.out.println(intY); System.out.println(a.charAt(i)); } else { System.out.println(a.charAt(i)); } }

}

}

2nd Solution

First split the string into string array, then iterate over that array, find the string that contains the number, convert that string into integer then add 10% to that and store back new value for that string. Then covert string array back to string using StringBuilder

Given an array with numbers 1-5, how would you subtract one number from each index?

1st Solution

def sub_each_ind(data_set): length = len(data_set) for index in range(length): data_set[index] = data_set[index] - 1 return data_set

Or if we don't want to modify the initial data:

def sub_each_ind(data_set): length = len(data_set) sub_dataset = [] for index in range(length): value = data_set[index] - 1 sub_dataset.append(value) return sub_dataset

2nd Solution

Here you go, this is pretty easy to solve. I have written the code using function and User input data as well.

user_data = int(input("How Many Numbers You want to enter:")) num = [int(input("Enter your Number :")) for x in range (user_data)] def substracting(num): result = [] for i in range(len(num)-1): result = num[i]-num[i+1] return result print("Final Result is :", substracting(num))

3rd Solution

Add x to an element once Subtract x from an element once Perform no operation on the element

Given an array with numbers 1-5, how would you subtract one number from every EVEN number in each index?

1st Solution

import java.util.*;

public class ArraySubtract { // Given an array with numbers 1-5, how would you subtract one number from every // EVEN number in each index

public static void main(String[] args) { int arr[] = { 2, 4, 5, 7, 10 }; List output = new ArrayList(); for (int i = 0; i < arr.length; i++) { if (arr[i] % 2 == 0) { output.add(arr[i] - 1); } else { output.add(arr[i]); } } System.out.println("Output Array : " + output.toString()); } }

OUTPUT: Output Array : [1, 3, 5, 7, 9]

2nd Solution

private static ArrayList subtractOneNumberinEachIndex(int[] inputArrayValue) {

ArrayList outputArrayValue = new ArrayList(); ArrayList evenNumbers = new ArrayList(); ArrayList oddNumbers = new ArrayList();

for (int i = 0; i < inputArrayValue.length - 1; i++) { if (inputArrayValue[i] % 2 == 0) { evenNumbers.add(inputArrayValue[i] - 1); } else { oddNumbers.add(inputArrayValue[i]); } }

outputArrayValue.addAll(oddNumbers); outputArrayValue.addAll(evenNumbers);

return outputArrayValue; }

3rd Solution {Might be the solution}

public class am2 {

public static void main(String[] args) { int[] a = {1,2,3,4,5}; int sub = 0; for (int i = 0; i < a.length; i++) { if(i%2==0 && i!=0) { sub = a[i]-1; a[i] = sub; } } for (int A:a) { System.out.println(A); }

}

4th Solution

public class Animal { public static void main(String[] args) { int[] nums={3,4,5,6,7,8}; System.out.println(Arrays.toString(substract(nums,6))); }

static int[] substract(int[] nums, int n){ //int[] nums2=nums; for (int i=0; i

Write the program to find the consecutive duplicate letters in each word of the sentence and print the sentence without duplicate letters

Solution

function removeDuplicate(){ var str = "Amazon is s good company" var arr = str.split(' '); var finalArr = [];

for (var i=0; i

Find the series of numbers in an array which gives the sum value as 3

string sort,convert given two digit binary number to decimal number,eliminate continuously repeated letter in string(aaabcbb to bc)
