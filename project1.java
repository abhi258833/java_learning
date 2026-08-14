import java.util.Scanner;

public class project1{
public static void main (String [] args ){

Scanner nameInput = new Scanner(System.in);
System.out.print("Please Enter your Name :");

String UserName = nameInput.nextLine();
System.out.print("Welcome to the Real coading world"+ UserName);

int score = 0;

Scanner Ans1  = new Scanner(System.in);
System.out.print("Tell me the sum of the 2+3 :");
int userAns1 = Ans1.nextInt();
if(userAns1 == 5){
score++;
}

Scanner Ans2  = new Scanner(System.in);
System.out.print("Tell me the subtraction of the 10 - 2 :");
int userAns2 = Ans2.nextInt();
if(userAns2 == 8){ 
score++;
}

Scanner Ans3  = new Scanner(System.in);
System.out.print("Tell me the multiply of the 3 * 2 :");
int userAns3 = Ans3.nextInt();
if(userAns3 == 6){ 
score++;
}

Scanner Ans4  = new Scanner(System.in);
System.out.print("Tell me the sum of the  2 + 3 :");
int userAns4 = Ans4.nextInt();
if(userAns4 == 5){ 
score++;
}
Scanner Ans5  = new Scanner(System.in);
System.out.print("Tell me the sum of the 2 + 3 :");
int userAns5 = Ans5.nextInt();
if(userAns5 == 5){ 
score++;
}
System.out.print("you have scored :" + score);



}
}
