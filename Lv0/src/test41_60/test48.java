package test41_60;

import java.util.Arrays;

public class test48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.16 1번문제
		//배열의 길이에 따라 다른 연산하기
		int[] arr = {444, 555, 666, 777};
		int n = 100;
		int[] answer = new int[arr.length];
		if((arr.length)%2==0) {
			for(int i = 0; i<arr.length;i++) {
				if(i%2==1) {
					answer[i]=arr[i]+n;
				}else {
					answer[i]=arr[i];
				}
			}
		}else {
			for(int i = 0; i<arr.length;i++) {
				if(i%2==0) {
					answer[i]=arr[i]+n;
				}else {
					answer[i]=arr[i];
				}
			}
		}
			
		System.out.println(Arrays.toString(answer));
		//다른 풀이
//		for(int idx=arr.length%2==0?1:0;idx<arr.length;idx+=2) {
//			삼항연산자를 통해서 arr의 길이가 짝수일 경우, 0번부터,
//			arr의 길이가 홀수 일경우 1번부터 인덱스가 시작되며,
//			+2를 통해서 짝수 or 홀수만 진행된다.
//			arr[idx]+=n;
//			return arr;
//			return을 해당 배열을 함으로써 따로 더해줄 필요가 없다.
//		}
//		
	}

}
