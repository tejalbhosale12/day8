package Day8;

public class CubeOfNumber {
	public static int square() {
		int num=40;
		int square=num*num;
		return square;
		
	}
	public static int cube() {
		int num=50;
		int cube=num*num*num;
		return cube;
	}
	
	public static void main(String[] args) {
		System.out.println("square:" + square());
		System.out.println("cube:" + cube());
	}
}
