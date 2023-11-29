package test21_40;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 글자 이어 붙여 문자열 만들기
		int[] index_list = {1,2,0,0,3};
		String my_string = "zpiaz";
		String answer = ""; 
		for(int i = 0 ; i<index_list.length;i++) {
			answer += my_string.charAt(index_list[i]);
		}
		System.out.println("answer : "+answer);
	}

}
