package test81_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,5,3};
		solution(arr);
	}

	public static int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> list  = new ArrayList<>();
        int i  = 0;
        while(i!=arr.length) {
        	if(list.size()==0) {
        		list.add(arr[i]);
        		i++;
        	}
        	if(list.get(list.size()-1)<arr[i]) {
        		list.add(arr[i]);
        		i++;
        	}else {
        		list.remove(list.size()-1);
        	}
        }
        System.out.println(list.toString());
//        Stack<Integer> stack = new Stack<>();
//        stack.pop();
//        for(int i = 0 ; i<arr.length;i++) {
//        	if(list.size()==0) {
//        		list.add(arr[i]);
//        	}
////        	System.out.println(list.get(list.size()-1));
//        	if(list.get(list.size()-1)<arr[i]) {
//        		System.out.println("작");
//        		list.add(arr[i]);
//        	}else {
//        		System.out.println("크");
//        		list.remove(list.size()-1);
//        	}
//        	System.out.println("list:"+list.toString());
//        	
//        }
        
        stk = list.stream().mapToInt(a->a).toArray();
        System.out.println(Arrays.toString(stk));
        return stk;
    }
}
