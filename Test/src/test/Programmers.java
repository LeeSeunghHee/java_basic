package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers {
	public static void main(String[] args) {
		String my_string = "hi12392";
		List<String> list = new ArrayList<>();
		int[] answer = new int [list.size()];
		String nums = "0123456789";
//		String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
		
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.contains(nums)) {
				list.add(nums);
			}
		}
		
//		for(int i = 1; i < list.size(); i++) {
//			answer[i-1] = Integer.parseInt(list.get(i));
//		}
//		Arrays.sort(answer);
//		System.out.println(answer);
		System.out.println(list.size());
	}
}
