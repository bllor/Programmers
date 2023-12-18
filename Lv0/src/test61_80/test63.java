package test61_80;

public class test63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.18 1번 문제
		// 특별한 이차원 배열2
		int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
		int answer = 0;
		answer = solution(arr);
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length;j++) {
//				if(arr[i][j]==arr[j][i]) {
//					answer = 1;
//					System.out.println(arr[i][j]);
//				}else {
//					answer = 0;
//				}
//			}
//		}
		System.out.println(answer);
	}

	public static int solution(int[][] arr) {
        int answer = 0;
        for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				if(arr[i][j]==arr[j][i]) {
					answer = 1;
				}else {
					answer = 0;
					return answer ;
				}
			}
		}
        return answer;
    }
	
}
