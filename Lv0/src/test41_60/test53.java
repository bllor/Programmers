package test41_60;

public class test53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 1번
		// 두 수의 연산값 비교하기
		
		int a = 91;
		int b = 2;
		
		int c = ((2*a*b)>(Integer.parseInt(""+a+b)))?(2*a*b):(Integer.parseInt(""+a+b));
		System.out.println(c);
	}

}
