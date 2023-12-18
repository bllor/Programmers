package test41_60;

public class test59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 7번 문제
		// A 강조하기
		
		String myString = "PrOgRaMmErS";
		String answer = "";
		myString.toLowerCase();
		answer = myString.toLowerCase().replaceAll("a", "A");
		System.out.println(answer);
	}

}
