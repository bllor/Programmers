package test01_20;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n번 째 원소부터 출력하기
		
		int[] num_list = {5,2,1,7,5};
		int number = 2;
		int[] answer = new int[num_list.length-number+1];
		int len = num_list.length-number-1;
		System.out.println("len :"+len);
		for(int i =number-1;i<num_list.length;i++) {
			answer[i-number+1]=num_list[i];
			System.out.println(num_list[i]);
		}
	}

}
