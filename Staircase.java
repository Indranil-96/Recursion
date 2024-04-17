package $Recursion;

public class Staircase {
	
	public static int Stair(int num) {
		if(num==0) {
			return 1;
		}
		else if(num<0) {
			return 0;
		}
		
		return Stair(num-1)+Stair(num-2)+Stair(num-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Stair(4));
	}

}
