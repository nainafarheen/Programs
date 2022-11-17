package practice;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;


public class ArrayList12 {

	public static void main(String[] args) {
		//insert code here
		try (Scanner scan = new Scanner(System.in)) {
			int n = Integer.parseInt(scan.nextLine());
			List<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i<n; i++) {
				list.add(Integer.parseInt(scan.nextLine()));
			}
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println(removeDuplicated(list));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	public static List<Integer> removeDuplicated(List<Integer> list) {
		Set<Integer> temp = new LinkedHashSet<Integer>();
		temp.addAll(list);
		list.clear();
		list.addAll(temp);
		return list;
		
	}

}
