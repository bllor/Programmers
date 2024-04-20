package test81_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test92. 세 개의 구분자
		String str = "cabab";
		String [] arr = solution(str);
		for(int i =0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(Arrays.toString(arr));
	}
//	public static String[] solution(String myStr) {
//        String[] answer = {};
//        if(myStr.indexOf("a")>=0||myStr.indexOf("b")>=0||myStr.indexOf("c")>=0) {
//        	if(myStr.indexOf("a")>=0) {
//        	myStr=myStr.replaceAll("a", " ");
//        	}
//        	if(myStr.indexOf("b")>=0) {
//            	myStr=myStr.replaceAll("b", " ").trim();
//            	}
//        	if(myStr.indexOf("c")>=0) {
//            	myStr=myStr.replaceAll("c", " ").trim();
//            	}
//        	answer = myStr.split(" ");
//        }
//        if(answer[0].isEmpty()) {
//        	return new String[] {"EMPTY"};
//        }
//		System.out.println(Arrays.toString(answer));
//
//        return answer;
//    }
	public static String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        // []는 문자의 집합이나 범위를 나타내고,
        // |는 or조건
        // + 앞 문자가 하나 이상 있다는 뜻이다.
        // 위의 조건으로 할 경우 a,b,c는 ,으로 변경되는데
        // replaceAll()을 문자 하나하나 해주지 않아도 된다.
        
        myStr = myStr.charAt(0)== ','?myStr.substring(1): myStr;
        //myStr의 첫글자가 ,일경우 뒤의 글자 변경하고 그렇지 않을 경우 myStr그대로 사용한다.
        myStr = myStr.equals("")? "EMPTY": myStr;
        //아무것도 없을 경우"EMPTY"를 반환한다.
        return myStr.split("[,]");
        		
    }
}
