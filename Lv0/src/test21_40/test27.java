package test21_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명씩 탑승
		
		String[] name = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		String[] answer = {};
		List<String> a = new ArrayList<>();
		for(int i = 0; i<name.length;i++) {
			if(i==0||i%5==0) {
				a.add(name[i]);
			}
		}
		 System.out.println("a :"+a.toString());
		 //리스트를 String 배열로 만들기 
		 answer= a.toArray(new String[a.size()]);
		 System.out.println("answer : "+Arrays.toString(answer));
	}

}
