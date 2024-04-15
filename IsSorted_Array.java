package Recursion;
import java.util.Scanner;

public class IsSorted_Array {
	
	public static boolean ArrSort(int[] arr) {  // use start index and end-index.
		
		if(arr.length==1) {
			return true;
		}
		
		if(arr[0]>arr[1]) {
			return false;
		}
		
		int []smallarray=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallarray[i-1]=arr[i];
		}
		
		boolean isSorted=ArrSort(smallarray);
		return isSorted;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length=sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the array element");
		
		for(int i=0; i<length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean result=ArrSort(arr);
		System.out.println(result);
		sc.close();
	}

}
