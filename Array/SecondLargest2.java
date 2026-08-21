public class SecondLargest2{

public static void main(String [] args){

int [] arr = {5,10,15};

int largest = Integer.MIN_VALUE;

int secondlargest = Integer.MIN_VALUE;


for(int i = 0; i < arr.length; i++){

if (arr[i] > largest){
secondlargest = largest;
largest = arr[i];

}else if(arr[i] < largest && arr[i] > secondlargest){
secondlargest = arr[i];
}
}

System.out.println("Second largest Number" + secondlargest);
}

}
