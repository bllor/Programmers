package test01_20;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원소들의 곱과 합
		int[] num_list = {1,2,3,4,5};
		int a1 = 0;
		int a2 = 1;
		for(int i = 0;i<num_list.length;i++) {
			a1+=num_list[i];
			a2*=num_list[i];
		}
		System.out.println("a1 : "+a1*a1+" a2 : "+a2);
	}

}
