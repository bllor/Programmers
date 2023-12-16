package test41_60;

public class test51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.16 4번 문제
		// 주사위 1
		
		int a = 2;
		int b = 4;
		int c = 0;
		if( a%2==1&&b%2==1) {
			c=a*a+b*b;
		}else if(a%2==1||b%2==1) {
			c=2*(a+b);
		}else {
			c=Math.abs(a-b);
		}
		System.out.println(c);
	}

}
