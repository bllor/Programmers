package test61_80;

import java.util.Arrays;

public class test70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.18 8번 문제
		// 수 조작하기 2
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		String answer= "";
		for(int i = 0; i<numLog.length;i++) {
			if(i>0) {
				 if((numLog[i]-numLog[i-1])==1) {
					answer+="w";
				}else if((numLog[i]-numLog[i-1])==-1) {
					answer+="s";
				}else if((numLog[i]-numLog[i-1])==10) {
					answer+="d";
				}else {
					answer+="a";
				}
			}
			
		}
		System.out.println(answer);
	}	

}
