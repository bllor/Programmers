package test_101_120;

import java.util.Arrays;

public class test103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "rermgorpsam";
		int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
//		StringBuilder sol = solution(my_string, queries);
		String sol = solution(my_string, queries);
		System.out.println(sol);
	}
	public static String solution(String my_string, int[][] queries) {
		String answer = "";
		char[] arr = my_string.toCharArray();
		char temp ;
//		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<queries.length;i++) {
			for(int j = queries[i][0];j<=(queries[i][0]+queries[i][1])/2;j++) {
				temp = arr[j];
				arr[j]=arr[queries[i][0]+queries[i][1]-j];
				arr[queries[i][0]+queries[i][1]-j]=temp;
			}
		}
		answer = String.valueOf(arr);
		return answer;

    }
	
//	public static StringBuilder solution(String my_string, int[][] queries) {
//		StringBuilder str = new StringBuilder(my_string);
//        
//        for(int i = 0; i < queries.length; i++) {
//            int start = queries[i][0];
//            int end = queries[i][1];
//            
//            StringBuilder s = new StringBuilder(str.substring(start, end+1));
//            s.reverse();
//            str.replace(start, end+1, s.toString());
//        }
//        
//        return str;
//
//    }
}
