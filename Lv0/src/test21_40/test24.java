package test21_40;

import java.util.Arrays;

public class test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n개 간격의 원소들
		int[] num_list = {4,2,6,1,7,6};
		int n  = 2;
		int m  = 0;
		int j = 0;
		if(num_list.length%n==0) {
			j=num_list.length/n;
		}else {
			j=num_list.length/n+1;
		}
		System.out.println("j : "+j);
		int[] answer = new int[j];
		for(int i = 0;i<num_list.length;i+=n) {
			answer[m++]=num_list[i];
			System.out.println("i "+i);
			System.out.println(num_list[i]);
		}
		System.out.println("answer : "+Arrays.toString(answer));
	}

}
