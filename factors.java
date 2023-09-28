package tapacademy;
import java.util.Scanner;

public class factors {
	
	
	static void fact(int n) {
		System.out.print("The factors of "+n+" are: ");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the value: ");
		int a = scan.nextInt();
		fact(a);

	}

}
