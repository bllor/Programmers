package test81_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test90 리스트 자르기
		int n = 4;
		int[] arr1= {1,2,2};
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		solution(n,arr1,arr2);
	}
	public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int num = 0;
        int num1 = 0;
       if(n==1) {
    	    num = slicer[1]+1;
    	   answer = Arrays.stream(num_list, 0, num).toArray();
       }else if(n==2) {
    	   num = slicer[0];
    	   answer = Arrays.stream(num_list, num, num_list.length).toArray();
    	   
       }else if(n==3) {
    	   num= slicer[0];
    	   num1= slicer[1]+1;
    	   answer = Arrays.stream(num_list, num, num1).toArray();
       }else {
    	   num= slicer[0];
    	   num1= slicer[1]+1;
    	   int num2= slicer[2];
    	   answer= Arrays.stream(num_list, num, num1).toArray();
    	   List<Integer> list = new ArrayList<>();
    	   if(answer.length==num2) {
    		   return answer;
    	   }else {
    	   System.out.println(answer.length);
    	   for(int i = 0; i<=answer.length;i+=num2) {
    		   list.add(answer[i]);
    	   }
    	   }
    	  answer = list.stream().mapToInt(i->i).toArray(); 
       }
        
        return answer;
    }
//	List<Integer> list = new ArrayList<>();
//    int a = slicer[0];
//    int b = slicer[1];
//    int c = slicer[2];
//    if(n == 1) {
//        for(int i =0; i<b+1; i++) {
//            list.add(num_list[i]);
//        }
//    }else if(n == 2) {
//        for(int i = a; i<num_list.length; i++) {
//            list.add(num_list[i]);
//        }
//    }else if(n ==3) {
//        for(int i = a; i<b+1; i++) {
//            list.add(num_list[i]);
//        }
//    }else if(n == 4) {
//        for(int i = a; i<b+1; i+=c) {
//            list.add(num_list[i]);
//
//        }
//    }
//    int[] answer = list.stream().mapToInt(x -> x).toArray();
//    return answer;

}
