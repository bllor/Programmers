package test61_80;

import java.util.Arrays;

public class test75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12/20 2번 문제
		// 수열과 구간 쿼리 1
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries	= {{0, 1},{1, 2},{2, 3}};
		for(int i = 0; i < queries.length;i++) {
			for(int j = queries[i][0];j<=queries[i][1];j++) {
				if(arr[j]>=queries[i][0]||arr[j]<=queries[i][1]) {
					arr[j]+=1;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr)); 
	
	}

}
