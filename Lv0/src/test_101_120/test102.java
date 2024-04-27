package test_101_120;

public class test102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String의 일치 여부는equals로 확인하는 것이 좋다.
		int a= solution(">", "!", 20, 78);
		System.out.println(a);
	}

	
	public static int solution(String ineq, String eq, int n, int m) {
		if (ineq.equals(">")) {
            if (eq.equals("=")) {
                    return n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                    return n > m ? 1 : 0;
            }
    } else if (ineq.equals("<")) {
            if (eq.equals("=")) {
                    return n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                    return n < m ? 1 : 0;
            }
    }
		return 0;
		
    }
}
