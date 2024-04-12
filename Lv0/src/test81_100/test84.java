package test81_100;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 84번. 배열의 길이를 2의 거듭제곱으로 만들기
		int[] a = {58, 172, 746, 89};
		solution(a);
	}
	public static int[] solution(int[] arr) {
//        int i = 0 ;
//        int j = arr.length;
//        while(j!=0) {
//        	 j = j/2;
//        	i++;
//        }
//        int list_length = 2;
//        for(int a = 0; a<i-1;a++) {
//        	list_length*=2; 
//        }
//        int[] ans_list = new int[list_length-arr.length];
//        System.out.println(list_length-arr.length);
//        for(int q = arr.length ; q<list_length ; q++) {
//        	ans_list[q-arr.length]=0;
//        }
//        int[] answer = {j+list_length};
//        answer = IntStream.concat( Arrays.stream(arr) ,Arrays.stream(ans_list)).toArray();
//        System.out.println(Arrays.toString(answer));
//        return answer;
		
		int n = arr.length;
        int targetLength = 1;
        
        // targetLength가 n보다 작거나 같은 2의 거듭제곱을 찾음
        while (targetLength < n) {
            targetLength *= 2;
        }
        
        // 0을 추가하여 targetLength 길이의 배열 생성
        int[] answer = new int[targetLength];
        Arrays.fill(answer, 0);
        
        // arr의 요소들을 answer로 복사
        System.arraycopy(arr, 0, answer, 0, n);
        
        return answer;
    }
}
