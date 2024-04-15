package Recursion;
import java.util.Scanner;
public class NoOfDigits {
	
	public static int countdigit(int num) {
		int count=0;
		if(num==0) {
			return 0;
		}
		int smallout=countdigit(num/10);
		int result=smallout+1;
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int result=countdigit(num);
		System.out.println(result);
	}

}
