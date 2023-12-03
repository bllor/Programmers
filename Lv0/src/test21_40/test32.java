package test21_40;

import java.util.Arrays;

public class test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 뒤에서 5등 위로 출력
		
		int[] num_list = {1,89,100,23,44,99,12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int a = 0;
		for(int i = 0;i<num_list.length;i++) {
			
			for(int j =i;j<num_list.length;j++) {
				if(num_list[i]>num_list[j]) {
					a=num_list[i];
					num_list[i]=num_list[j];
					num_list[j]=a;
				}
			}
		}
		int[] answer = new int[num_list.length-5];
		
		System.out.println(Arrays.toString(num_list));
		System.out.println(num_list.length-5);
		int b = 0;
		
		for(int i =5;i<num_list.length;i++) {
			
			answer[b]=num_list[i];
			b++;
		}
		System.out.println(Arrays.toString(answer));
	}

}
