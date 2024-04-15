package Recursion;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Sum_N_NaturalNumbers {
	
	
	public static int sum(int num) {
		if(num==0) {
			return 0;
		}
		int smallout=sum(num-1);  //Induction Hypothesis.
		int result=num+smallout;  // Induction steps.
		return result;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO= new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);
		
		int num=Integer.parseInt(BR.readLine());
		int result=sum(num);
		System.out.println(result);
	}

}
