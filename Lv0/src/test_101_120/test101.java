package test_101_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,1,1,0};
		int[] arr2 = {0,1,0,1,0};
		int[] arr3 = {0,1,1,0};
		int[] arr4 = {1,1,1,0};
		int[] arr5 = {1,1,0,1};
		int[] arr6 = {0,0,1,0,0,0,1,0,1,1,1,1,1,1,1,1};
		int[] b= solution(arr6);
		System.out.println(Arrays.toString(b));
	}

	
	public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i!=arr.length) {
        	if(list.size()==0) {
        		System.out.println("1");
        		list.add(arr[i]);
        		i++;
        	}else if(list.get(list.size()-1)==arr[i]) {
        		System.out.println("2");
        		System.out.println(list.get(list.size()-1)+",2,"+arr[i]);
        		System.out.println("마지막번호아님?"+(list.size()-1));
        		list.remove(list.size()-1);
        		i++;
        	}else {
        		System.out.println("3");
        		System.out.println(list.get(list.size()-1)+",3,"+arr[i]);
                		list.add(arr[i]);
        		i++;
        	}
        	System.out.println("i :"+i+" "+list.toString());
        }
        if(list.size()==0) {
    		answer = new int[] {-1};
        }else {
        	answer = list.stream().mapToInt(a->a).toArray();
        }
        return answer;
    }
}
