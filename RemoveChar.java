package $Recursion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class RemoveChar {

	public static String remvChar(String str) {
		
		if(str.length()<=1) {

			if(str.charAt(0)=='a') {
				return "";
			}else {
				return str;
			}
		}
		
		if(str.charAt(0)=='a') {
			str=str.substring(1);
			return remvChar(str);
		}
		else
		return str.charAt(0)+remvChar(str.substring(1));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);
		System.out.println("Enter the string");
		String str=BR.readLine();
		
		System.out.println(remvChar(str));
	}

}
