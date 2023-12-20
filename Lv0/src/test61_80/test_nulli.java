package test61_80;

public class test_nulli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "sssss";
		String a = "Q";
		String answer ="";
		int b = 0;
		for(int i = 0; i<s.length();i++) {
			for(int j =0;j<s.length();j++) {
				if(j==i) {
					answer+=a;
				}else {
					answer+=s.charAt(i);
				}
			}
			System.out.println(answer);
			answer="";
		}
		
		for(int k = s.length()-2;k>=0;k--) {
			for(int n = 0; n<s.length();n++) {
				if(k-n==0) {
					answer+=a;
				}else {
					answer+=s.charAt(0);
				}
			}
			System.out.println(answer);
			answer="";
		}
	}

}
