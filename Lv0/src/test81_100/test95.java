package test81_100;

public class test95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 9 QR CODE
//		System.out.println(4%3);
			String code = "qjnwezgrpirldywt";
			String code2 = "programmers";
			String a = solution(1, 0, code2);
			System.out.println(a);
	}
	public static String solution(int q, int r, String code) {
        
		String answer = "";
        for(int i = 0; i<code.length();i++) {
        	if(i%q==r) {
        		answer+=code.charAt(i);
        	}
        }
		
		return answer;
    }
}
