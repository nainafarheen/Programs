package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = {2,1,3,4,3,4,2,4,3,4};
		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++) {
			if(i==k)
				System.out.println(arr[i]);
		}
		
		

	}

}
