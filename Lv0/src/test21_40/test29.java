package test21_40;

public class test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n보다 커질 때까지 더하기
		int n = 139;
		int[] numbers = {58, 44, 27, 10, 100};
		int answer =0;
		for(int i =0;i<numbers.length;i++) {
			answer+=numbers[i];
			if(answer>n) {
				break;
			}
		}
		System.out.println("answer : "+answer);
	}

}
