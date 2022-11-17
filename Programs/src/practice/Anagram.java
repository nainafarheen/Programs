package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		int l1=s1.length();
		int l2=s2.length();
		if(l1!=l2) {
			System.out.println("Lengths of two strings are not same");
		}
		else {

			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int c=0;
			for(int i=0; i<l1; i++) {
				if(ch1[i]==ch2[i]) 
					c++;
			}
			if(c==l1)
				System.out.println(s1 +" and "+ s2 +" are anagrams");
			else
				System.out.println("Both are not anagrams");
		}
		

	}

}
