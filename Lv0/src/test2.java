
public class test2 {

	public static void main(String[] args) {
		//최소 공배수 구하기
		// TODO Auto-generated method stub
		int number = 30;
		int n = 2;
		int m =3;
		
		int answer = solution(number, n, m);
		System.out.println(number/2);
		System.out.println(number%2);
		System.out.println(answer);
	}

	 static int solution(int number, int n , int m) {
		int answer = 0;
		 
		if(number%n==0&&number%m==0) {
			answer = 1;
		}else {
			answer = 0;
		}
		 return answer;
	}

}
