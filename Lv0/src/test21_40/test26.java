package test21_40;

import java.util.ArrayList;
import java.util.List;

public class test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 원소 삭제하기
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		int a = 0;
		int n = 0;
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<delete_list.length;j++) {
				a=0;
				if(arr[i]==delete_list[j]) {
					break;
				}
				a=arr[i];
			}
			if(a!=0) {
			System.out.println("a :"+a);
			list.add(a);
			}
		}
		answer=list.stream().mapToInt(i->i).toArray() ;
		System.out.println("list :"+list.toString());
		
		
		}
	}


