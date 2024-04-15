package Recursion;

import java.util.Scanner;

public class ArraySum {
	
	public static int Arrsum(int [] arr, int length) {
		if(length<=0) {
			return 0;
		}
		
		int sum=Arrsum(arr,length-1);
		int smallout=sum+arr[length-1];
		return smallout;
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
		
		int result=Arrsum(arr,length);
		System.out.println(result);
		sc.close();
	}

}
