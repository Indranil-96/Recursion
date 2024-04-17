package $Recursion;

public class Sum_OF_DIgit {
	
	public static int sum(int num) {
		if(num<10) {
			return num;
		}
		
		int smallout=num%10;
		int largeout=smallout+sum(num/10);
		
		return largeout;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(223));
	}

}
