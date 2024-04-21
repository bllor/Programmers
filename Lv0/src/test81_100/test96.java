package test81_100;

import java.util.Arrays;

public class test96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test96 문자 개수 세기
		String my_string = "Programmers";
		int[] arr = solution(my_string);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static int[] solution(String my_string) {
        String text_list = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        int[] answer = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] answer = new int[52];
        //위의 answer처럼 하지 않아도 처음에 정의될 때 0으로 저장됨.
        for(int i = 0 ; i<my_string.length();i++) {
        	if(text_list.indexOf(my_string.charAt(i))>=0) {
        		
        		answer[text_list.indexOf(my_string.charAt(i))] +=1;
        	}
        	
        }
        
        return answer;
    }
}
