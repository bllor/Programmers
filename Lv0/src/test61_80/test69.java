package test61_80;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class test69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.18 7번 문제
		// 문자리스트를 문자열로 만들기
		String[] arr = {"a","b","c"};
		String answer= "";
		for(int i = 0; i < arr.length;i++) {
			answer+=arr[i];
		}
		System.out.println(answer);
		//Stream으로 처리하기
//		Arrays.stream(arr).collect(Collectors.joining());
//		Collectors.joining() == string 배열 arr을 단일 문자열로 저장해주는 역할
	}

}
