package test61_80;

public class test64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.18 2번 문제
		// l로 만들기
		String a = "b";
		int b  = 0;
		b = a.hashCode();
		System.out.println(b);
		String myString = "abcdevwxyz";
		String answer = "";
		for(int i = 0; i<myString.length();i++) {
			if((""+myString.charAt(i)).hashCode()<108) {
				answer+="l";
			}else {
				answer+=myString.charAt(i);
			}
		}
		System.out.println(answer);
//		정규식[^l-z] l~z가 아닌 경우.
	}	

}
