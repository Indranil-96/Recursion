package Recursion;

import java.util.Scanner;

public class FirstIndex {
	
	public static int Index(int arr[],int si,int num) {
		if(si==arr.length) {
			return -1;
		}
		if(arr[si]==num) {
			return si;
		}
		return Index(arr,si+1,num) ;
		
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
		int si=0;
		int result=Index(arr,si,x);
		
		if(result==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println(result);
		}
	}

}
