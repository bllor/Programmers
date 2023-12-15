package test41_60;

import java.util.Arrays;
import java.util.stream.Collectors;

public class test45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.15 1번 문제
		// 꼬리 문자열
		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		String answer = "";
		for(int i = 0; i<str_list.length;i++) {
			if(str_list[i].contains(ex)) {
				System.out.println(i+" "+str_list[i]);
				answer+=str_list[i].replaceAll(str_list[i], "");
			}else {
				answer+=str_list[i];
			}
		}
		System.out.println("answer : "+answer);
		
		//Stream을 활용한 풀이 방법
//		Arrays.stream(str_list).filter(s -> !s.contains(ex)).collect(Collectors.joining());
	}

}
