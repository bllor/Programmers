package test01_20;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홀짝에 따라 다른 값 반환하기
		int n = 7;
		int answer = 0;
		if(n%2==0) {
			for(int i =n; i>0;i-=2) {
				answer+=i*i;
			}
		}else {
			for(int i =n; i>0;i-=2) {
				System.out.println("홀수");
			answer+=i;
			}	
		}
		System.out.println("answer : "+answer);
	}

}
