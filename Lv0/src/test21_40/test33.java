package test21_40;


public class test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 특정 문자를 대문자로 바꾸기
		//12.3 2번문제
		
		String my_string = "programmers";
		String alp ="p";
		String answer = "";
		for(int i = 0; i<my_string.length();i++) {
			if(alp.equals(""+my_string.charAt(i))) {
				answer+=String.valueOf(my_string.charAt(i)).toUpperCase();
			}else {
				answer+=my_string.charAt(i);
			}
		}
		System.out.println("answer : "+answer);

		//다른 풀이 방식
		String a = alp.toUpperCase();
		my_string.replaceAll(alp, a);
		//alp와 같은 것을 모두 a로 변경한다.
		
		

	}
}
