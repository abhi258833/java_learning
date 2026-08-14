import java.util.Scanner;

public class user_inputAge {

public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    int age = scan.nextInt();
    System.out.println("your age is:" + age);
}
}