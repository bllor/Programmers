package test61_80;

public class test80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.23 1번 문제
		// 2차원 배열 대각선 순회하기
		int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
		int k = 2;
		int answer  = 0;
		for(int i = 0; i<board.length;i++) {
			for(int j = 0; j<board[i].length;j++) {
				if(i+j<=k) {
					answer+=board[i][j];
				}
			}
		}
		System.out.println(answer);
		
	}

}
