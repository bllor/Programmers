package test41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "xabcxdefxghi";
		int a = 0;
		List<Integer> list = new ArrayList<>();
		int[] answer = {};
		for(int i = 0;i<=myString.length();i++) {
			if(i==myString.length()) {
				list.add(a);
				break;
			}
			if(myString.charAt(i)!='x') {
				a++;
			}else {
				list.add(a);
				a=0;
			}
		}
		answer = list.stream().mapToInt(Integer -> Integer).toArray();
		
		//다른 사람 풀이
//		Arrays.stream(myString.split("x",myString.length())).mapToInt(x -> x.length()).toArray();
	}

}
