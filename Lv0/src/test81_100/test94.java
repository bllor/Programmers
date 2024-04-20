package test81_100;

import java.util.Arrays;

public class test94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 94 조건에 맞게 수열 반환하기2
		int[] arr = {1, 2, 3, 100, 99, 98};
		solution(arr);
//		boolean b = false;
////		int b = 0;
//		int a= 3;
//		int i = 1;
//		while(!b) {
////			System.out.println("1");
//			if(a>=50&&a%2==0) {
//        		a=a/2;
//        		i++;
//        	}else if(a<50&&a%2==1){
////    			System.out.println("2");
//
//        		a=a*2+1;
//        		i++;
////    			System.out.println(a);
//
//        	}else {
//        		b=true;
//        	}
////			System.out.println(a);
//		}
//		System.out.println(i);
	}
//	public static int solution(int[] arr) {
//		int answer = 0;
//        for(int c = 0; c<arr.length;c++) {
//        	System.out.println(c);
//        	int i =0;
//        	for(int j = 0;j< arr.length;j++) {
//        		boolean b= false;
//        		while(!b) {
//        			if(arr[j]>=50&&arr[j]%2==0) {
//        				arr[j]=arr[j]/2;
//                		i++;
//                	}else if(arr[j]<50&&arr[j]%2==1){
//                		arr[j]=arr[j]*2+1;
//                		i++;
//                	}else {
//                		b=true;
//                	}
//        			System.out.println("for i :"+i);
//        		}
//        	}
////        	System.out.println("i :"+i);
//        }
//		System.out.println(Arrays.toString(arr));
//        return answer;
//    }
	public static int solution(int[] arr) {
		int answer = 0;
		boolean tf = false;
		while(!tf) {					
		int a = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>=50&&arr[i]%2==0) {
				arr[i]=arr[i]/2;
			a++;	
			}else if (arr[i]<50&&arr[i]%2==1) {
				arr[i]=arr[i]*2+1;
				a++;
			}else {
				System.out.print(arr[i]);
				
			}	
		}
		System.out.println("a :"+a);
		if(a==0) {
			System.out.println("correct :"+Arrays.toString(arr));
			tf = true;
		}
		answer ++;
		
	}
		System.out.println("answer:"+answer);
		return answer;
    }
}
