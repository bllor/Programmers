package test41_60;

public class test55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 3번 문제
		// 홀수 vs 짝수
		int[]num_list = {4, 2, 6, 1, 7, 6};
		int a = 0;
		int b = 0;
		for(int i = 0; i<num_list.length;i++) {
			if(i%2==0) {
				System.out.println(num_list[i]);
				a+=num_list[i];
			}else {
				b+=num_list[i];
			}
		}
		System.out.println(a);
		System.out.println(b);
		
	}

}
