public class SubhamSecondLargest{



public static void main(String [] args){


int [] arr = {-10,-5,-20,-12,-8};

int largest = Integer.MIN_VALUE;

int secondLargest = Integer.MIN_VALUE;


for(int i = 0; i< arr.length; i++){

if (arr[i] > largest){
largest = arr[i];


}else if (arr[i] <  largest && secondLargest < arr[i]){
secondLargest = arr[i];

}


}
System.out.println("second Largest" + secondLargest);

}

}
