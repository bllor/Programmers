package test61_80;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.18 4번 문제
		// 접미사 배열
		String my_string = "banana";
		List<String> list = new ArrayList<>();
		String[] answer= {};
		for(int i = 0;i<my_string.length();i++) {
			list.add(my_string.substring(i, my_string.length()));
		}
		Collections.sort(list);
		answer = list.toArray(new String[list.size()]);
	}

}
