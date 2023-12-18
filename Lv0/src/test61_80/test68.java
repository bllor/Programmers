package test61_80;

import java.util.ArrayList;
import java.util.List;

public class test68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.18 6번 문제
		// 배열 만들기 3
		
		int[] arr = {1,2,3,4,5};
		int[][] intervals = {{1,3},{0,4}};
		int[] answer = {};
		List<Integer>list = new ArrayList<>();
		for(int i = 0; i<intervals.length;i++) {
			for(int j =intervals[i][0];j<=intervals[i][1];j++) {
				list.add(arr[j]);
			}
		}
		answer = list.stream().mapToInt(Integer -> Integer).toArray();
	}

}
