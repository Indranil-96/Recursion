package Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class isArraySorted {
	
	public static boolean isSorted(int arr[],int si) {
		if(si==arr.length-1) {
			return true;
		}
		
		if(arr[si]>arr[si+1]) {
		return false;
		}
		
		return isSorted(arr,si+1);
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);
		
		System.out.println("Enter the length of the array");
		int length=Integer.parseInt(BR.readLine());
		int arr[] = new int[length];
		System.out.println("Enter the array element");
		int i=0;
		while(i<length) {
			arr[i]=Integer.parseInt(BR.readLine());
			i++;
		}
		int si=0;
		boolean result=isSorted(arr,si);
		System.out.println(result);
	}

}
