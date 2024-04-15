package Recursion;
import java.util.Scanner;
public class Fibonachi {
	
	public static int fibo(int num) {
		
		if(num==1 || num==2) {
			return 1;
		}
		
		int fib1=fibo(num-1);
		int fib2=fibo(num-2);
		int result=fib1+fib2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int result=fibo(num);
		System.out.println(result);
	}

}
