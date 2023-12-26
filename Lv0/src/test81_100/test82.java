package test81_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.26 2번문제
		// 문자열 뒤집기
		
		String my_string= "Progra21Sremm3";
		int s = 6; 
		int e = 12;
		String answer = "";
		
		String a = "";
		for(int j = e; j >=s;j--) {
			a+=my_string.charAt(j);
		}
		for(int i = 0;i<my_string.length();i++) {
			if(i>=s&&i<=e) {
				answer+=a.charAt(i-6);
			}else {
				answer+=my_string.charAt(i);
			}
		}
		System.out.println(answer);
		

//		StringBuffer answer = new StringBuffer(my_string.substring(s, e+1));
//		answer.reverse();
//		String a =  my_string.substring(0,s)+ answer +my_string.substring(e+1);
//		System.out.println(a);
//		/*
//		 * StringBuffer
//		 * -가변하는 문자열을 처리하기 위한 클래스.
//		 * -즉, 새로운 문자열은 추가하거나 변경하게 되면 기존의 객체로 추가 및 변경된다.
//		 * 
//		 * StringBuilder
//		 * -java에서 StringBuilder는 가변한 문자열을 처리하기 위한 클래스
//		 * -새로운 문자열을 추가하거나 변경하게 되면 기존의 객체로 추가 및 변경이 된다.
//		 * -StringBuffer와 다르게 멀티쓰레드 환경에서 안정적이지 않으며, StringBuilder는 싱글쓰레드 환경에서
//		 *  StringBuffer보다 더 빠른 성능을 가진다.
//		 * -사용 메서드
//		 * append(String str) :문자열 끝에 str을 붙인다.
//		 * reverse : 문자열을 뒤집는다.
//		 * insert(int x, String str) : x위치에 str을 넣는다.
//		 * delete(int x, int y) : x~y범위의 문자열을 지운다.
//		 * 
//		 * my_string.substring(e+1)에서 e+1의 길이가 my_string보다 짧으면 아무것도 출력되지 않는다.
//		 */
		
		
//		char[] arr = my_string.toCharArray();
//		while(s<e) {
//			//s가 e보다 작을 때까지 실행된다.
//			char temp = arr[s];
//			arr[s++] = arr[e];
//			arr[e--] = temp;
//			/*
//			 * s와 e 모두 나중에 계산되므로
//			 * 1 -- s:6 , e: 12
//			 * 2 -- s:7 , e: 11
//			 * 로 계산이 이루어 진다.
//			 */
//		}
//		String str = new String(arr);
		
	}

}
