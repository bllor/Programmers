package test41_60;

import java.util.ArrayList;
import java.util.List;

public class test54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 2번문제
		// 공백으로 구분하기 1
		String my_string = "i love you";
		List<String>list = new ArrayList<>();
		String str = "";
		for(int i = 0; i<=my_string.length();i++) {
			if(i==my_string.length()) {
				if(str.length()>0) {
					list.add(str);
				}
				break;
			}
			if(!(my_string.charAt(i)==' ')) {
				str+=my_string.charAt(i);
			}else {
				list.add(str);
				str="";
			}
		}
		list.toArray(String[]::new);
	}
	
	//다른 풀이
//	String[] answer = my_string.split(" ");
//	공백을 기준으로 나누어 저장
}
