package tapacademy;

import java.util.Scanner;

public class second_largest {
	static int large2(int[] a) {
		int f1 = Integer.MIN_VALUE;
		int f2 = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>f1) {
				f2 = f1;
				f1 = a[i];
			}
			else if (a[i]>f2){
				f2 = a[i];
			}
		}
		return f2;
//		System.out.println("The 1st largest value is: "+f1);
//		System.out.println("The 2nd largest value is: "+f2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int [n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int res = large2(a);
		System.out.println(res);
		
	}

}
