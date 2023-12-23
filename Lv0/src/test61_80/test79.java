package test61_80;

import java.util.Arrays;
import java.util.stream.Collectors;

public class test79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.22 1번 문제
		// 글자 지우기
		String my_string ="apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		Arrays.sort(indices);
		String answer = "";
		String[] tmp = my_string.split("");
		for(int i = 0;i<indices.length;i++) {
			tmp[indices[i]]="";
		}
//		for(int j =0; j<tmp.length;j++) {
//			answer+=tmp[j];
//		}
		answer = Arrays.toString(tmp);
		System.out.println(answer);
	}

}
