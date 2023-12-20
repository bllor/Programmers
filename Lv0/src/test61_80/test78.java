package test61_80;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.20 5번 문제
		// 날짜 비교하기
		int[] date1 = {2021,11,26};
		int[] date2 = {2021,11,27};
		int answer  = 0;
		
		String a= "";
		String b= "";
		for(int i = 0; i<date1.length;i++) {
			a+=""+date1[i];
			b+=""+date2[i];
			
		}
		if(Integer.parseInt(a)<Integer.parseInt(b)){
			answer = 1;
		}
		System.out.println(answer);
	
	
	}
	
}
