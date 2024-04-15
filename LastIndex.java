package Recursion;

import java.util.Scanner;

public class LastIndex {
	
	public static int lIndex(int [] arr,int ei,int num) {
		if(ei<=0) {
			return -1;
		}
		
		if(arr[ei]==num) {
			return ei;
		}
		
		return lIndex(arr,ei-1,num);
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
		int ei=length-1;
		int result=lIndex(arr,ei,x);
		
		if(result==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println(result);
		}
	
	}

}
