import java.util.Scanner;

public class countOccurrences{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number to check it occurences :");

int num = sc.nextInt();
int count = 0;
int [] arr = {1,2,2,2,3,2,3,3,4,4,5,5,6,6,7};

for(int i = 0; i < arr.length; i++){
if(arr[i] == num){
count++;
}
}
System.out.print("The occurences of "+num+" is :"+ count);


}

}
