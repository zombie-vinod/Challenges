package Challenges;

public class ChallengeTwo  {
	public static void main(String[] args) {
		System.out.println(Area.area(5));
		System.out.println(Area.area(10, 10));
		
	}

}

    
    
class Area{
	public static final double pie = 3.142;
	public static double area(double radius) {
		if(radius<0) {
			return -1.0;
		}
		return 2*pie*radius;
		
	}
	
	public static double area(double x, double y) {
		if(x<0 || y<0) {
			return -1.0;
		}
		return x*y;
	}
}


