public class findAverage{

public static void main(String [] args){

int [] arr = {1,2,3,4,7};
int n = arr.length;
int sum = 0;

for(int i = 0; i< n; i++){

sum = sum + arr[i];
}
float average = (float)sum/n;
System.out.print("Average of the element of the array" + average);
}

}
