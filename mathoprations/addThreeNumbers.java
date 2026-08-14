/* 
 public class addThreeNumbers{

static int a = 2;
static int b = 3;
static int c = 4;

public static void main(String []args){

int sum = a + b + c ;

System.out.print("Sum of three number A B C : "+ sum);

}


 } 
*/


// by taking input from user
/*
import java.util.Scanner;

 public class addThreeNumbers{


public static void main(String []args){

Scanner sc = new Scanner(System.in);


System.out.print("Enter the first number: ");

int a = sc.nextInt();

System.out.print("Enter the Second  number: ");

int b  = sc.nextInt();


System.out.print("Enter the Third number: ");

int c  = sc.nextInt();



System.out.print("Sum of three number A B C : " + (a+b+c));
 
}

}

*/

// using add method

import java.util.Scanner;
 
 public class addThreeNumbers{


public static void main(String []args){

Scanner sc = new Scanner(System.in);


System.out.print("Enter the first number: ");

int a = sc.nextInt();

System.out.print("Enter the Second  number: ");

int b  = sc.nextInt();


System.out.print("Enter the Third number: ");

int c  = sc.nextInt();



System.out.print("Sum of three number A B C : " + sum(a + b + c));
 
}


int sum (int a,int b ,int c ){
return a+b+c;
}
 
}

 
 

