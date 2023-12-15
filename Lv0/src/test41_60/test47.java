package test41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.15 3번 문제
		// 할 일 목록
		
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		List<String> an = new ArrayList<>();
		String[] answer = {};
		for(int i =0; i<finished.length;i++) {
			if(!finished[i]) {
				an.add(todo_list[i]);
			}
		}
		answer = an.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(answer));
			
	}

}
