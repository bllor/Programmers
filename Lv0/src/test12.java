import java.util.Arrays;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//마지막 두 원소
		
		int[]num_list = {5,2,1,7,5};
		int num_len = num_list.length;
		int[]answer = new int[num_len+1];
		System.out.println("len "+num_len);
		System.out.println("answer "+answer.length);
		
		for(int i = 0 ; i<=num_len;i++) {
			if(i==num_len) {
				if(num_list[i-2]-num_list[i-1]>0) {
					answer[i]=num_list[i-1]*2;
					System.out.println(answer[i]);
					return;
				}else {
					answer[i]=num_list[i-1]-num_list[i-2];
					System.out.println(answer[i]);
					return;
				}
			}
			answer[i]=num_list[i];
			System.out.println(answer[i]);
		}
		System.out.println(Arrays.toString(num_list));
	}

}
