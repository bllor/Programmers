package test81_100;

import java.util.ArrayList;
import java.util.List;

public class test81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.26 1번 문제
		// 빈 배열에 추가, 삭제하기
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		int[] answer = {};
		
		List<Integer>list = new ArrayList<>();
		
		for(int i = 0; i<arr.length;i++) {
			if(flag[i]) {
				for(int n = 0; n<arr[i]*2;n++) {
					list.add(arr[i]);
				}
			}else {
				for(int t = 0; t<arr[i];t++) {
					list.remove(list.size()-1);
				}
			}
		}
		System.out.println(list.toString());
		answer = list.stream().mapToInt(i -> i).toArray();
	}

}
