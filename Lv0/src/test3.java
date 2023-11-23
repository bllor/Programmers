
public class test3 {

	public static void main(String[] args) {
		//첫 번째로 나오는 음수
		// TODO Auto-generated method stub
		int[] num_list = {1,2,-3,4,-5};
		
		int size = num_list.length;
		int answer = -1;
		for(int i =0;i<size;i++) {
			if(num_list[i]<0) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
