package Recursion;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class X2thePowerOfN {
	
	public static int power(int x , int n) {
		if(n==0) {
			return 1;
		}
		
		int smallout=power(x,(n-1));
		int result=smallout*x;
		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);
		
		int x=Integer.parseInt(BR.readLine());
		int n=Integer.parseInt(BR.readLine());
		
		int result=power(x,n);
		System.out.println(result);
	}

}
