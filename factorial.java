package Recursion;
import java.util.Scanner;
public class factorial {
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int smallout=fact(n-1);
		int output=n*smallout;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result=fact(num);
		
		System.out.println(result);
	}

}
