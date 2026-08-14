import java.util.Scanner;

public class useNameInput {
    public static void main (String  [] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please Enter your Name:");
        String name1 = name.nextLine();
        System.out.println("Your name is: " + name1);

    }
}