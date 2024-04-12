package test81_100;

public class test85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aaaa";
		String b = "aa";
		System.out.println(solution(a, b)); 
	}
	public static int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i<myString.length();i++) {
        	if(i<=myString.length()-pat.length()) {
        		String d = myString.substring(i, i+pat.length());
        		System.out.println(d.indexOf(pat));
        		if(d.indexOf(pat)>=0) {
        			answer+=1;
        		}
        	}        	
        }
        return answer;
    }
}
