package $Recursion;

public class Geomatric_Sum {
	
	public static double Gsum(int num) {
		
		if(num==0) {
			return 1;
		}
		
		double smallout=1/Math.pow(2,num);
		double longout=Gsum(num-1);
		
		return smallout+longout;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Gsum(12));
	}

}
