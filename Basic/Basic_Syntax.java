/*
1.  Java Program to Print an Integer (Entered by the User) \[E]
2.  Java Program to Add Two Integers \[E]
3.  Java Program to Multiply two Floating Point Numbers \[E]
4.  Java Program to Find ASCII Value of a character \[E]
5.  Java Program to Compute Quotient and Remainder \[E]
6.  Java Program to Swap Two Numbers \[E]
7.  Java Program to Check Whether a Number is Even or Odd \[E]
8.  Java Program to Check Whether an Alphabet is Vowel or Consonant \[E]
9.  Java Program to Check Whether a Character is Alphabet or Not \[E]
10. Java Program to Display Alphabets (A to Z) using loop \[E]
11. Java Program to Iterate over enum \[E]
12. Java Program to Determine the name and version of the operating system \[E]
132.Java Program to Check if two of three boolean variables are true \[E]
*/

//Answers
//1.  Java Program to Print an Integer (Entered by the User) \[E]

import java.util.Scanner;
class Basic_Syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = sc.nextInt();
        System.out.println("The integer is: " +num);
        sc.close();
    }
}

//2.  Java Program to Add Two Integers
import java.util.Scanner;
class Basic_Syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first_num = sc.nextInt();

        System.out.println("Enter second number: ");
        int sec_num = sc.nextInt();

        int sum;
        sum = first_num + sec_num;
        System.out.println("The sum of two numbers is: " +sum);
        sc.close();
    }
}

//3.  Java Program to Multiply two Floating Point Numbers
import java.util.Scanner;
class Basic_Syntax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first float point: "); //88.4
        float fp1 = sc.nextFloat();
        System.out.println("Enter second float point: "); //334.64
        float fp2 = sc.nextFloat();
        float sum;
        sum = fp1+fp2;
        System.out.println("the sum of two float points is: " +sum); //423.04
    }
}

//4.  Java Program to Find ASCII Value of a character \[E]
import java.util.Scanner;
class Basic_Syntax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char asciiCharacter = sc.next().charAt(0);
        System.out.println("The value of given character: " + asciiCharacter+  " is: " + (int) asciiCharacter);
        sc.close();
    }
}

//5.  Java Program to Compute Quotient and Remainder \[E]
import java.util.Scanner;
class Basic_Syntax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        System.out.println("enter the number to divide: ");
        int div = sc.nextInt();
        int qnt = num/div;
        int rem = num%div;
        System.out.println("The Quotient of number is: " + qnt + " and Reminder is: " +rem);
        sc.close();
    }
}