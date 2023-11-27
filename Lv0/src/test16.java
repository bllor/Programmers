import java.util.Arrays;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카운트 다운
		int start= 10;
		int end =3;
		int[] arr = new int[start-end+1];
		System.out.println(arr.length);
		for(int i = start;i>0;i--) {
			arr[start-i]=i;
			if(i==end) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
