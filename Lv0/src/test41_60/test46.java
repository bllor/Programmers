package test41_60;

public class test46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.15 2번 문제
		//부분 문자열
		
		String str1 ="tbt";
		String str2 ="tbbttb";
	
		if(str2.contains(str1)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		int answer = str2.contains(str1)?1:0;
	}

}
