package test81_100;

import java.util.Arrays;

public class test87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 87 수열과 구간 쿼리 3
		int [] arr = {0,1,2,3,4};
		int [][] a2 = {{0,3},{1,2},{1,4}};
		int[] result = solution(arr,a2);
		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i = 0; i<queries.length;i++) {
        	int a= answer[queries[i][0]]; 
        	answer[queries[i][0]]=answer[queries[i][1]];
        	answer[queries[i][1]] = a;
        }
        
        return answer;
    }

}
