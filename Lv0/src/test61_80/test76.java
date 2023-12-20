package test61_80;

public class test76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.20 3번 문제
		// 문자열 섞기
		
		String str1 ="aaaa";
		String str2 ="bbbb";
		String answer= "";
		for(int i = 0; i<str1.length();i++) {
			answer +=str1.charAt(i);
			answer +=str2.charAt(i);
		}
		System.out.println(answer);
	}

}
