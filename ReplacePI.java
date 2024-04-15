package $Recursion;
import java.util.Scanner;
public class ReplacePI {
	
	public static String ReplacePi(String str) {
		if(str.length()<=1) {
			return str;
		}
		
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			String smallout=ReplacePi(str.substring(2));
			return "3.14"+smallout;
		}else {
			String smallout=ReplacePi(str.substring(1));
			return str.charAt(0)+smallout;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(ReplacePi(str));
	}

}
