package test01_20;
import java.util.Arrays;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건에 맞게 수열 반환하기 
		int k = 2;
		int[] arr = {1,2,3,100,99,98};
		int[] answer = new int[arr.length];
		System.out.println(arr.length);
		if(k%2==0) {
			System.out.println("짝수");
			for(int i =0;i<arr.length;i++) {
				
				answer[i]=arr[i]+k;
				System.out.println(i+" :"+(arr[i]+k));
			}
		}else {
			for(int i =0;i<arr.length;i++) {
				answer[i]=arr[i]*k;
				System.out.print(answer[i]);
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}
