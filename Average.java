package Day8;

public class Average {

	public static int marks(int a, int b, int c) {
		return a+b+c/3;
	}
	
	public static void main(String[] args) {
		int result=marks(78,84,90);
		System.out.println("Average"+ result);
	}
}
