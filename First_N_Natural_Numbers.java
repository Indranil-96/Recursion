package Recursion;
import java.util.Scanner;
public class First_N_Natural_Numbers {
	
	public static void printNumber(int range) {
		if(range==0) {
			return;
		}
		
		printNumber(range-1);
		System.out.println(range);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range=sc.nextInt();
		printNumber(range);
	}

}
