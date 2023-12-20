package test61_80;

import java.util.ArrayList;
import java.util.List;

public class test74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.20 1번 문제
		// 세로 읽기
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;
		String answer = "";
		List<String> list = new ArrayList<>();
		String str = "";
		String[] s = {};
		for(int i = 0; i<my_string.length();i++) {
			str+=my_string.charAt(i);
			if(str.length()==m) {
				list.add(str);
				str="";
			}
		}
		s = list.toArray(new String[list.size()]);
		for(int i = 0; i<s.length;i++) {
				answer+=s[i].charAt(c-1);
			
		}
		System.out.println(answer);
		
		//다른 사람 풀이
//		for(int i =c-1; i< my_string.length();i+=m) {
//			answer +=my_string.charAt(i);
//			c는 문자열의 시작점을 나타내며,
//			해당시작점에서 부터 m의 배수에 해당하는 문자만 저장이 된다.
//		}
		
	}

}
