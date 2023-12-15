package test41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.12 테스트 2번
		// 순서 바꾸기
		
		int[] num_list = {2, 1, 6};
		int n = 1;
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		
		int[] answer = new int[num_list.length];
		for(int i = 0; i<num_list.length;i++) {
			if(i>=n) {
				a.add(num_list[i]);
			}else {
				b.add(num_list[i]);
			}
		}
		c.addAll(a);
		c.addAll(b);
		answer = c.stream().mapToInt(Integer -> Integer).toArray();
		System.out.println("answer :"+Arrays.toString(answer));
		
		//다른 풀이
//		int idx = 0;
//		int[] answer = new int[num_list.length];
//        for (int i = n;i < num_list.length;i++)
//            answer[idx++] = num_list[i];
//        for (int i = 0;i < n;i++)
//            answer[idx++] = num_list[i];
//        return answer;
		
	}

}
