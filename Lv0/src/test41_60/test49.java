package test41_60;

import java.util.ArrayList;
import java.util.List;

public class test49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.16 2번 문제
		//공백으로 구분하기
		String my_string =" i love you";
		String str = "";
		List<String> list = new ArrayList<>();
		String[] answer = {};
		for(int i = 0; i<=my_string.length();i++) {
			if(i==my_string.length()) {
				System.out.println("last");
				if(str.length()>0) {
					System.out.println("before add str :"+str);
					list.add(str);
				}
				break;
			}
			if(!(my_string.charAt(i)==' ')) {
				str+=my_string.charAt(i);
			}else{
				if(str.length()>0) {
					System.out.println("before add str :"+str);
					list.add(str);
				}
				
				str="";
			}
			
		}
		answer = list.toArray(new String[list.size()]);
		System.out.println(list.toString());
		
		//다른 풀이 방법
		
//		my_string.trim().split("[ ]+");	
//		trim을 사용할 경우, 문자열 앞과 뒤의 공백을 제거해준다.
//		split("[ ]+")를 함으로써 공백이 있을 경우 자른다는 것 같음.
//		\\s 또한 공백을 자른다는 것
		
	}

}
