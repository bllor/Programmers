package test61_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.18 5번
		// 문자열 잘라서 정렬하기
		
		String myString = "dxccxbbbxaaaa";
		String[] answer = {};
		System.out.println(myString);
		myString = myString.replaceAll(" ", "");
		List<String> list = new  ArrayList<>();
		String str = "";
		for(int i = 0; i<=myString.length();i++) {
			if(i==myString.length()) {
				if(str.length()>0) {
					list.add(str);
				}
				break;
			}else if(myString.charAt(i)=='x') {
				if(str.length()>0) {
					list.add(str);
				}
				str="";
			}else {
				str+=myString.charAt(i);
			}
			System.out.println(str);
		}
		answer = list.toArray(new String[list.size()]);
		System.out.println(list.toString());
		
		//Stream을 이용한 풀이
		Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
		
	}

}
