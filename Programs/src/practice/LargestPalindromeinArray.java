package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LargestPalindromeinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arr = {"aaa", "aba", "adda", "acdea", "aeda"};
		String[] arr = {"abc","hhh","yuyuyu", "bababab", "eeee"};
		Map<String,Integer> smap = new HashMap<String, Integer>();
		for(int i=0; i<arr.length; i++) {
            String str = arr[i];
            if(ispanlidrome(str)) {
            	smap.put(str, str.length());      
            }            
	}		
		int maxLength=Collections.max(smap.values());
		for(Entry e :smap.entrySet()) {
			if((int)e.getValue()==maxLength) {
        	System.out.println(e.getKey()+" "+e.getValue());
			}
        }
}

	private static boolean ispanlidrome(String str) {
		String rev="";
        for(int i=str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str)) {
            return true;
        }
        return false;
	}
}

