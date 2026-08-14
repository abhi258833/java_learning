
import java.util.Scanner;

public class radiusOfCircle{

public static void main (String[] args){
System.out.print("Enter the radius of the circile");

Scanner sc = new Scanner(System.in);
int  r  = sc.nextInt();



System.out.print("Area of the circile is :"+ areaOfCircle(r));

}

}
double  areaOfCircle(int r){
 return Math.PI*Math.sqrt(r);
}
