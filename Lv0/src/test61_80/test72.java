package test61_80;

public class test72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.19 2번문제
		// 주사위게임 2
		int a = 5;
		int b = 3;
		int c = 3;
		int answer = 0;
		if(a!=b&&a!=c&&b!=c) {
			answer=a+b+c;
		}else if(a==b&&b!=c||a==c&&b!=c||a!=b&&b==c) {
			answer=(a+b+c)*(a*a+b*b+c*c);
		}else {
			answer=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);			
		}
		System.out.println(answer);
	}

}
