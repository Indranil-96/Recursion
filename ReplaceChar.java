package $Recursion;

public class ReplaceChar {
	
	public static String CharReplace(String s, char a, char b) {
		if(s.length()==0) {
			return s;
		}
		
		String smallout=CharReplace(s.substring(1),a,b);
		
		if(s.charAt(0)==a) {
			return b+smallout;
		}
		
		else {
			return s.charAt(0)+smallout;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbahypgyhufffyhgtyuhggbb";
		char a='y';
		char b='x';
		System.out.println(CharReplace(str,a,b));
	}

}
