package Day8;

import java.util.*;
public class PositiveNegative {
	
	public static int PosNeg() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		
		if(no>=0) {
			System.out.println("positive no" + no);
		}
		else {
			System.out.println("negative no" + no);
		}
		
		return no;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(PosNeg());
	}

	
}
