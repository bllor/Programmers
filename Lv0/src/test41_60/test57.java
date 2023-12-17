package test41_60;

import java.util.Arrays;

public class test57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 4번 문제
		// 가까운 1 찾기
		int[] arr = {1,0,0,1,0,1,0,0};
		int idx = 0;
		int answer = -1;
		for(int i = idx; i<arr.length;i++) {
			if(arr[i]==1) {
				answer = i;
				break;//가장 작은 인덱스를 찾는 것이 문제이므로, 찾게되면 for문을 멈춰도 된다.
			}
//			가장 작은 인덱스를 찾아야할 때는 필요없는 식이다.
//			else {
//				if(answer>=0) {
//					answer = answer;
//				}else {
//					answer = -1;
//				}
//			}
		}
		System.out.println(answer);
	}

}
