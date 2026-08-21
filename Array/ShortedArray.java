import java.util.Scanner;


public class ShortedArray{


public static void main(String[] args){
boolean shorted = true;
System.out.print("Enter Array size");

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int[] arr = new int[n];

System.out.print("Enter"+ n + " elements:");


for(int i = 0; i < n; i ++){
arr[i] = sc.nextInt();
} 
System.out.print("Array  elements are:");

for(int i =0; i < n; i++){
System.out.print(arr[i]);

}


for(int i =0; i < n-1; i++){

if(arr[i] > arr[i+1]){
shorted = false;
break;
}

}

if(shorted){
System.out.print("array is shorted");
 

}else {

System.out.print("array is not  shorted");
}

sc.close();





}
}
