package test81_100;

import java.util.ArrayList;
import java.util.List;

public class test88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test88 문자열 묶기
		String[] arr = {"a","bc","d","efg","hi"};
		int a = solution(arr);
		System.out.println(a);
	}
	public static int solution(String[] strArr) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<strArr.length;i++ ) {
			list.add(strArr[i].length());
//			int storedNum = 0;
//			for(int j = i;j<=strArr.length-1;j++) {
//				if(strArr[i].length()==strArr[j].length()) {
//					storedNum++;
//				}
//			}
//			if(answer<storedNum) {
//				answer = storedNum;
//			}
		}
//		System.out.println(list.size()%2);
//		System.out.println(list.size()/2);
		int[] arr2 = list.stream().mapToInt(i->i).toArray();
		for(int j = 0;j<arr2.length/2;j++) {
//			System.out.println("1");
			int storedNum = 0;
			for(int k = 0;k<=arr2.length-1;k++) {
				//				System.out.println(j+" "+k);
//				System.out.println(list.get(j));
				if(arr2[j]==arr2[k]) {
					storedNum++;
				}
			}
			System.out.println(list.size());
//			System.out.println(storedNum);
			if(answer<storedNum) {
				answer = storedNum;
			}
		}
        return answer;
    }
	
//	public static int solution(String[] strArr) {
//		int answer = 0;
//		for(int i = 0;i<strArr.length;i++ ) {
//			int storedNum = 0;
//			for(int j = i;j<=strArr.length-1;j++) {
//				if(strArr[i].length()==strArr[j].length()) {
//					storedNum++;
//				}
//			}
//			if(answer<storedNum) {
//				answer = storedNum;
//			}
//		}
//		
//        return answer;
//    }
}
