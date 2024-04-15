package test81_100;

public class test86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 간단한 논리연산
	}

	
	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = true;
        if(x1==x2&&x2==x3&&x3==x4) {
        	return x1;
        }
 		if(x1&&x3) {
 			return true;
		}else if(!x1&&!x2||!x3&&!x4){
			return false;
		}
		return answer;
    }
}
