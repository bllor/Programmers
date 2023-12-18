package test41_60;

import java.util.ArrayList;
import java.util.List;

public class test58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 6번 문제
		// 콜라츠 수열 만들기
		
		int[] answer = {};
		int n = 10;
		List<Integer> list = new ArrayList<>();
		list.add(n);
		while(n!=1) {
			
			if(n%2==0) {
				n=n/2;
				list.add(n);
			}else {
				n=3*n+1;
				list.add(n);
			}
		}
		System.out.println("list :"+list.toString());
		answer = list.stream().mapToInt(Integer -> Integer).toArray();
	}

}
