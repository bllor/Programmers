package test81_100;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class test98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test 98. 두 수의 
		int []arr = {1,4,2,5,3};
		String a = "18446744073709551615";
		String b = "287346502836570928366";
		System.out.println(solution(a, b));
		
	}
	public static String solution(String a, String b) {
        String answer = ""; 
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger sum = aa.add(bb);
        answer  = String.valueOf(sum);
        return answer;
    }
}
