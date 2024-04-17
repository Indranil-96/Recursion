package $Recursion;

public class Multiplication {

	public static int multiple(int m, int n) {
		if(n==0) {
			return 0;
		}
		int smallout=multiple(m,n-1);
		int longout=m+smallout;
		return longout;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiple(12,12));
	}

}
