package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int newn=num;
		//num=787;
		int rev=0;
		while(num>0) {
			int i =num%10;
			rev =rev*10 + i;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==newn) {
			System.out.println("Palindrome");
		}
		else {
		System.out.println("Not a palindrome");
		}

	}

}
