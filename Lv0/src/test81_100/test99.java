package test81_100;

import java.util.Arrays;

public class test99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test99 왼쪽 오른쪽
		
		String[] str_list = {"u", "u", "l", "r"};
		String[] str_list2 = {"l", "u","u", "u","d","l","l", "u","d","r"};
		String[] str_list4 = {"d", "l","u", "u","d","d","d", "d","d","r"};
		String[] str_list3 = {"r"};
		String[] a = solution(str_list4);
		System.out.println(Arrays.toString(a));
		
	}
	public static String[] solution(String[] str_list) {
		String[] answer = {};
		for(int i =0; i<str_list.length;i++) {
			if(str_list[i].indexOf("l")==0) {
				System.out.println("l이다");
				if(i==0) {
					break;
				}else {
					answer = new String[i];
					for(int j = 0;j<answer.length;j++ ) {
						answer[j]=str_list[j];
					}
					break;
				}
			}else if(str_list[i].indexOf("r")==0) {
				System.out.println("r이다");
				if(i==str_list.length) {
					break;
				}else {
					answer = new String[str_list.length-i-1];
					for(int j =0;j<answer.length;j++) {
						answer[j]=str_list[j+i+1];
					}
					break;
				}
			}
			}
		
		return answer ;
	}
	public static String[] solution2(String[] str_list) {
		String[] answer = {};
		for(int i =0; i<str_list.length;i++) {
//			int a= str_list[i].indexOf("l")==0 ? i :9999;
//			int b= str_list[i].indexOf("r")==0 ? i :9999;
//			System.out.println(a+ "  "+b);
//			if(b!=9999&&b<str_list.length) {
//				answer = new String[str_list.length-i-1];
//				for(int j = i+1; j<str_list.length;j++) {
//					answer[j-i-1] =str_list[j];
//				}
//				break;
//			}
//			if(a!=9999) {
//				answer = new String[str_list.length-i-1];
//				for(int j = 0; j<answer.length;j++) {
//					answer[j] =str_list[j+i];
//				}
//				break;
//				}
//			}
			if(str_list[i].indexOf("l")>=0) {
				if(i==str_list.length) {
					break;
				}else {
				answer = new String[str_list.length-i-1];
				for(int j = 0; j<answer.length;j++) {
					answer[j] =str_list[j+1];
				}
				break;
				}
			}else if(str_list[i].indexOf("r")>=0) {
				if(i==0) {
					break;
				}else {
				answer = new String[str_list.length-i];
				for(int j = i; j<str_list.length;j++) {
					answer[j-i] =str_list[j-i];
				}
				break;
				}
			}
			
		}
        return answer;
    }
}
