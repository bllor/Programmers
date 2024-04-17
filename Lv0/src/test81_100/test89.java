package test81_100;

import java.util.Arrays;

public class test89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 89 2의영역
//		int[] arr = {1,2,1,2,1,10,2,1};
//		int[] arr = {1,2,1};
		int[] arr = {1,1,1};
		int[] a =  solution(arr);
		System.out.println(Arrays.toString(a));
	}

	
	public static int[] solution(int[] arr) {
		int[] answer = {-1};
        String a= "";
        a = Arrays.toString(arr).replaceAll(" ", "").trim();
        int st =  a.indexOf("2");
        int fi = a.lastIndexOf("2");
        String[] b = {};
        if(st==fi&&st>0) {
        	b =  a.substring(st,fi+1).split(", ");
        }else if(st>=0&&fi>=0) {
        	b = a.substring(st, fi+1).split(",");
        	
        }
        if(b.length>0) {
        	answer = Arrays.stream(b).mapToInt(Integer::parseInt).toArray();
        }      
        return answer;
    }
}
