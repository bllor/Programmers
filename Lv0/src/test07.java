import java.util.stream.Stream;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_int = {1,2,3,4,5};
		int num =3;
		int answer = 0;
		for(int i = 0; i<arr_int.length;i++) {
			if(num==arr_int[i]) {
				answer = 1;
				break;
			}
		}
		System.out.println(answer);
	}

}
