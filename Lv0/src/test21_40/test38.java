package test21_40;

import java.util.Arrays;

public class test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.4 1번 문제
		// 조건에 맞게 수열 반환하기
		
		
		int[] arr = {1, 2, 3, 100, 99, 98,50,77,48,47,5,7,9,51,52,53,54};
		int[] answer = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>=50&&arr[i]%2==0) {
				answer[i]=(arr[i]/2);
			}else if(arr[i]<50&&arr[i]%2==1) {
				answer[i]=arr[i]*2;
			}else {
				answer[i]=arr[i];
			}
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
