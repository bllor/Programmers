package test61_80;

public class test77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.20 4번 문제
		// 등차수열의 특정한 항만 더하기
		int a = 3;
		int d = 4;
		boolean[] included = {true, false, false, true, true};
		int answer = 0;
		for(int i = 0;i<included.length;i++) {
			if(i==0) {
				if(included[i]) {answer+=a;}
			}else {
				a+=d;
				if(included[i]) {answer+=a;}
			}
		}
		System.out.println(answer);
		//다른 풀이
//		for(int i = 0; i<included.length;i++) {
//			if(included[i]) {
//				answer += a+(d*i);
//			}
//		}
		
	}

}
