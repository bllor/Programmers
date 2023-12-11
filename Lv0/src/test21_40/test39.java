package test21_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.4 2번 문제
		// 순서 바꾸기
		
		int[] num_list = {2, 1, 6};
		int n = 1;
		int[] answer = new int[num_list.length];
		List<Integer> aa = new ArrayList<>();
		List<Integer> bb = new ArrayList<>();
		List<Integer> cc = new ArrayList<>();
		int a = 0;
		for(int i =0;i<num_list.length;i++) {
			if(i>=n) {
				aa.add(num_list[i]);
				a++;
			}else {
				bb.add(num_list[i]);
			}
		}
		System.out.println("aa :"+aa.toString());
		System.out.println("bb :"+bb.toString());
		
		
		System.out.println(Arrays.toString(answer));
	}

}
