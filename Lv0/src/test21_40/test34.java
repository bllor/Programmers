package test21_40;

import java.util.stream.Stream;

public class test34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 정수의 합
		// 12.3 3번째 문제
		String num_str = "1000000";
		int answer = 0;
		for(int i = 0;i<num_str.length();i++) {
			answer += Integer.parseInt(""+num_str.charAt(i));
		}
		System.out.println(answer);
		
		//stream을 사용한 풀이
		answer = Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();
		//num_str.split으로 ""을 제거하고
		//Integer :: parseInt는 Integer :: Integer.parseInt와 같은 것 같다.
		//그 다음 sum을 통해서 합친다.
		
	}

}
