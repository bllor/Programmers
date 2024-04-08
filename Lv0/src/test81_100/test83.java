package test81_100;

import java.util.ArrayList;
import java.util.List;

public class test83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 만들기 (5)
		
	String intStre[] = {"0123456789","9876543210","9999999999999"};
	int k = 50000;
	int s = 5;
	int l = 5;
	 int a[]=solution(intStre, k, s, l);
	 
	}
	
	public static int[] solution(String[] intStrs, int k , int s, int l ) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<intStrs.length ;i++) {
//		System.out.println(intStrs[i]);
		
		int n = Integer.parseInt(intStrs[i].substring(s,s+l));
		if(n>k) {
			list.add(n);
		}
//		System.out.println(n);
		}
		answer=list.stream().mapToInt(i->i).toArray() ;
//		System.out.println(list);
		
		
		return answer;
	}

}
