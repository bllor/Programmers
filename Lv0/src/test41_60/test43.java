package test41_60;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.14 1번문제
		// 대소문자 변환하기
		String[] strArr = {"aBc","AbC"};
		String[] answer = new String[strArr.length];
		
		for(int i = 0; i<strArr.length; i++) {
			if(i==0) {
				answer[i]=strArr[i].toLowerCase();
			}else if(i%2==0) {
				System.out.println("i"+i);
				answer[i]=strArr[i].toLowerCase();
			}else {
				answer[i]=strArr[i].toUpperCase();
			}
		}
		System.out.println("answer :"+Arrays.toString(answer) );
		//stream을 이용한 풀이
		IntStream.range(0, strArr.length).mapToObj(i -> i%2==0? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
	}

}
