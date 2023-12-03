package test21_40;

import java.util.ArrayList;
import java.util.List;

public class test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 만들기
		// 12.3 4번째 문제
		
		int n =15;
		int k = 5;
		int[]answer = {};
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=15;i++) {
			if(i%k==0) {
				System.out.println("i :"+i);
				list.add(i);
			}
		}
		answer = list.stream().mapToInt(value -> value).toArray();
	}

}
