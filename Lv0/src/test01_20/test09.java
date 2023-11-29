package test01_20;

public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_num = 3;
		int end_num = 10;
		int[] arr = new int[end_num-start_num+1];
		for(int i =start_num;i<=end_num;i++) {
			arr[i-start_num]=i;
		}
		System.out.println(arr);
	}

}
