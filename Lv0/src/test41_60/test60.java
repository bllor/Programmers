package test41_60;

import java.util.Arrays;

public class test60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 8번 문제
		// 특별한 이차원 배열 1
		int n = 3;
		int[][] answer = new int[n][n];
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<n;j++) {
				if(i==j) {
					answer[i][j]=1;
				}else {
					answer[i][j]=0;
				}
			}
		}
		System.out.println("answer : "+Arrays.toString(answer[2]));
	}

}
