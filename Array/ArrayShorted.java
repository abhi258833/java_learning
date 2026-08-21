import java.util.Scanner;

public class ArrayShorted{
	
	public static void main(String [] args){
		
		System.out.print("Enter the Array size:");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("The Size of Element:" + n);
		int arr [] = new int[n];
		boolean shorted = true;
		
		for(int i = 0; i < n; i++){
			
			System.out.print("Enter the Array" + " "+ (i+1) + " " + "Element:");
			arr[i] = sc.nextInt();
			
		}
		
		System.out.print("Elements of the Array:");
		
		for(int i = 0; i < n; i++){
			
			System.out.print(arr[i] + " ");

		}
		
			for(int i = 0; i < n-1; i++){
			
			if(arr[i] > arr[i+1]){
				
				shorted = false;
				break;
			}
		}
		
		if(shorted){
			System.out.println("Elements of Array is shorted");
			
		}else{
			
			System.out.println("Elements of Array is not shorted");
		}
		
		
		
	}
	
	
}