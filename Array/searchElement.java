
import java.util.Scanner;
public class searchElement{

public static void main(String[] args){


Scanner sc = new Scanner(System.in);
System.out.print("Enter element to Search :");

int search = sc.nextInt();
boolean found = false;
int [] arr = {1,2,3,4,5,6,7,8,9,10};

for(int i = 0; i<arr.length; i++){
if (arr[i] == search){
found = true;
break;

}

}
if(found){
System.out.print(" Search element is availabe :"+ search);
}else{
System.out.print("Search element is not available :"+ search);
}
sc.close();
}
}



