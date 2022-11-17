package practice;

import java.util.Scanner;

public class Prime1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		
		System.out.println("Prime numbers are :");
		
		for(int i=2; i<=n; i++) {
			int c=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					c++;
				}
					
			}
			if(c==2)
				System.out.print(i+" ");
		}
	}

}
