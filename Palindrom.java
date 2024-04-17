package $Recursion;

public class Palindrom {
	
	public static boolean Checkpalin(String str,int si, int ei) {
		
		if(si>=ei) {
			return true;
		}
		if(str.charAt(si)!=str.charAt(ei)) {
			return false;
		}
		boolean result=Checkpalin(str,si+1,ei-1);
		return result;
		
	}
	
	public static boolean isPalindrom(String input) {
		int si=0,ei=input.length()-1;
		
		if(input.length()<=1) {
			return true;
		}
		
		boolean result=Checkpalin(input,si,ei);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrom("INIv"));
	}

}
