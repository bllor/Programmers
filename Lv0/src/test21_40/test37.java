package test21_40;

import java.util.ArrayList;
import java.util.List;

public class test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 원소만큼 추가하기
		// 12.3 5번째 문제
		
		int[] arr = {5,1,4};
		int[] answer = {};
		List<Integer>list = new ArrayList<>();
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i];j++) {
				System.out.print(arr[i]);
				list.add(arr[i]);
			}
			System.out.println("");
		}
		System.out.println("list : "+list.toString());
		answer = list.stream().mapToInt(i -> i ).toArray();
		System.out.println();
	}

}
