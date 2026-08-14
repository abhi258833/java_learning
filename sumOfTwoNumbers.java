import java.util.Scanner;

public  class sumOfTwoNumbers {

public static void main (String [] args){

Scanner input1 = new Scanner(System.in);

System.out.print("Enter the First Number : ");

int num1 = input1.nextInt();


Scanner input2 = new Scanner(System.in);

System.out.print("Enter the First Number : ");

int num2 = input2.nextInt();

System.out.print("Sum of" + num1 + "and" + num2 + " : " + (num1 + num2));

}
}