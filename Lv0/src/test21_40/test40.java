package test21_40;

import java.util.Arrays;

public class test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 뒤에서 5등까지 출력
		// 12.11 1번 문제
		
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		int a = 0;
		int[] answer = new int[5];
		for(int i = 0; i<num_list.length;i++) {
			for(int j =i;j<num_list.length;j++) {
				if(num_list[i]>num_list[j]) {
					a=num_list[j];
					num_list[j]=num_list[i];
					num_list[i]=a;
				}
			}
		}
		for(int i = 0; i<5;i++) {
			answer[i]=num_list[i];
		}
		System.out.println("answer :"+Arrays.toString(answer)); 
		
	}
}


/*
	다른 풀이
	1.Stream
	Arrays.stream(num_list).sorted().limit(5).toArray();
	sorted가 오름차순으로 정렬해주는 메서드인 것 같다.
*/