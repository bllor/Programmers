package test61_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 10번 문제
		// 간단한 식 계산하기
		String binomial = "40000 * 40000";
		int answer = 0;
		String[] arr = {};
		arr = binomial.split(" ");
		switch(arr[1]) {
		case "+" :
			answer = (Integer.parseInt(arr[0])+Integer.parseInt(arr[2]));
			break;
		case "-" :
			answer = (Integer.parseInt(arr[0])-Integer.parseInt(arr[2]));
			break;
		case "*" :
			answer = (Integer.parseInt(arr[0])*Integer.parseInt(arr[2]));
			break;

		}
		System.out.println(answer);
	}

}
