package test01_20;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 더 크게 합치기
		
		int n =3;
		int m = 4;
		String s1 = ""+n+m;
		String s2 = ""+m+n;
		int answer = 0;
		System.out.println("s1 : "+s1);
		if(Integer.parseInt(s2)>Integer.parseInt(s1)) {
			answer = Integer.parseInt(s2);
		}
		System.out.println("answer : "+answer);
	}

}
