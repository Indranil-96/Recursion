package $Recursion;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class RemoveConsecutive {
	
	public static String RemoveCons(String str) {
		
		if(str.length()<=1) {
			return str;
		}
		
		if(str.charAt(0)==str.charAt(1)) {
			return RemoveCons(str.substring(1));
		}
		else {
			return str.charAt(0)+RemoveCons(str.substring(1));
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);
		
		String str=BR.readLine();
		System.out.println(RemoveCons(str));
	}

}
