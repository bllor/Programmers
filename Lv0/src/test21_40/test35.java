package test21_40;

public class test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 바꿔서 찾기
		// 12.3 3번째 문제
		
		String myString = "ABAB";
		String st = "";
		String pat = "ABAB";
		int answer = 0;
		
		for(int i = 0; i<myString.length();i++) {
			if((myString.charAt(i))==('B')) {
				st+='A';
			}else {
				st+='B';
			}
		}
		if(st.indexOf(pat)>=0) {
			answer = 1;
		}
		System.out.println("answer : "+answer);
	}

}
