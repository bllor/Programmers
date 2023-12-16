package test41_60;

import java.util.Arrays;

public class test50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.16 3번 문제
		//부분 문자열 이어 붙여 문자열 만들기
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts =  {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		String answer= "";
		for(int i = 0; i<parts.length;i++) {
			for(int j = parts[i][0];j<=parts[i][1];j++) {
				answer +=my_strings[i].charAt(j);
				System.out.print(i+" "+my_strings[i].charAt(j));
			}
			System.out.println("");
		}
		System.out.println(answer);
		
	}

}
