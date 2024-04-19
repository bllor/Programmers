package test81_100;

import java.util.Arrays;

public class test91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test91 수열과구간 쿼리4
		int[][]queries = {{0,4,1},{0,3,2},{0,3,3}};
		int[] arr = {0,1,2,4,3};
		solution(arr, queries);
	}
	public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i = 0; i<queries.length;i++) {
        		
        		for(int a = queries[i][0];a<=queries[i][1];a++) {
        			if(a==0) {
        				arr[0]++;
        			}else if(a%queries[i][2]==0) {
        				arr[a]++;
        			}
        		}
        	}
        	answer = Arrays.stream(arr).toArray();
        return answer;
    }
}
