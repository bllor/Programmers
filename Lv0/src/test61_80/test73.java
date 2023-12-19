package test61_80;

public class test73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.19 3번 문제
		// 9로 나눈 나머지 값 출력
		String number = "78720646226947352489";
		int answer = 0;
		for(int i =0; i<number.length();i++) {
			answer+=Integer.parseInt(""+number.charAt(i));
		}
		answer=answer%9;
		System.out.println(answer);
	}

}
