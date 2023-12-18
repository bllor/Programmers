package test61_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.17 9번 문제
		// ad 제거하기
		String[] strArr = {"and","notad","abcd"};
		String[] answer = {};
		List<String> list = new ArrayList<>();
		for(int i = 0; i<strArr.length;i++) {
			if(!strArr[i].contains("ad")) {
				list.add(strArr[i]);
			}
		}
		list = Arrays.stream(strArr).filter(m -> !m.contains("ad")).collect(Collectors.toList());
		answer  =  list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(answer));
	}

}
