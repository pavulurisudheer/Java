package tapacademy;

import java.util.Scanner;

public class RecursionFactorial {
	
	static int Factorial(int num,int fact) {
		fact = fact * num;
		num = num-1;
		
		if(num==0) {
			return fact;
		}
		
		return Factorial(num,fact);

		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();
		int fact = 1;
		int res = Factorial(num,fact);
		System.out.println(res);
	}

}
