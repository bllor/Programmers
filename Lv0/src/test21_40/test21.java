package test21_40;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수 조작하기1
		int n = 10;
		String control = "wsdawsdassw";
		int ta = 0;
		int answer = 0;
		for(int i = 0; i<control.length();i++) {
			
			if(control.charAt(i)=='w') {
				answer =(n+=1);
			}else if(control.charAt(i)=='s') {
				answer =(n-=1);
			}else if(control.charAt(i)=='d') {
				answer =(n+=10);
			}else {
				answer =(n-=10);
			}
			System.out.println(n);

		}
		System.out.println("answer : "+answer);
	}

}
