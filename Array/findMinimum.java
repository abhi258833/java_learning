public class findMinimum{

public static void main (String [] args){


int[] arr = {3,2,1,0,6};

int minimum = arr[0];

for(int i = 1; i < arr.length; i++){

if(minimum > arr[i]){
minimum = arr[i];
}
}
System.out.print("Minimum element is : "+ minimum);
}
}
