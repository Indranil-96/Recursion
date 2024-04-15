package Recursion;

import java.util.Scanner;

public class IndexElement {
	
	public static boolean helper(int [] arr,int element,int length) {
		
		if(length==0) {
			return false;
		}
		
		if(arr[length]==element) {
			return true;
		}
		boolean isis= helper(arr,element,length-1);
		return isis;
	}
	
	
	public static boolean isIndex(int [] arr, int x) { // External recursion.
		int length=arr.length-1;
		return helper(arr,x,length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an Array");
		int length=sc.nextInt();
		int arr[]= new int[length];
		System.out.println("Enter the Array Element");
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to be searched");
		int x= sc.nextInt();
		
		boolean result=isIndex(arr,x);
		System.out.println(result);
	}

}
