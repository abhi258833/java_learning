import java.util.Scanner;

public class EvenOdd{

public static void main(String [] args){

System.out.print("Enter the number to check weather it is even or odd");

Scanner sc = new Scanner(System.in);

int num = sc.nextInt();

if(num % 2 == 0 ){

System.out.print("Entered Number is Even :"+ num );

}else 

System.out.print("Entered Number is Odd :"+ num );

}

}
