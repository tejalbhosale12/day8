package Day8;

public class GreaterNumber {
	
	public static int grater() {
		int num1=10;
		int num2=20;
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("grater number" + grater());
	}
}
