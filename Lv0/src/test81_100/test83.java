package test81_100;

public class test83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
		String myString = "AAAAaaaa";
		String pat = "a";
		
		int a = myString.lastIndexOf(pat);
		System.out.println(myString.substring(0, a)+pat);
	}

}
